package subp2;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Passenger extends Thread {
    private Semaphore semaphore , taxiSemaphore;
    Semaphore emptySemaphore = new Semaphore(1);
    Semaphore fullSemaphore = new Semaphore(0);
    Message message = new Message();
    Taxi taxi = new Taxi();
    Random random = new Random();
    int passengerNumber;
    public Passenger(){}
    public Passenger(Semaphore semaphore, Semaphore taxiSemaphore, Message message, int passengerNumber, Semaphore emptySemaphore, Semaphore fullSemaphore) {
        this.semaphore = semaphore;
        this.taxiSemaphore = taxiSemaphore;
        this.emptySemaphore = emptySemaphore;
        this.fullSemaphore = fullSemaphore;
        this.message = message;
        this.passengerNumber = passengerNumber;
    }
    @Override
    public void run(){
        int timeInMuseum = random.nextInt(2)+1;

        try {//age semaphore khali bood khata bede
            emptySemaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        message.nameThread = passengerNumber;
        emptySemaphore.release();
        message.enterMuseum();
        try {
            Thread.sleep(timeInMuseum * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        while (!taxi.taxiFull()){
            try {
                emptySemaphore.acquire();
                taxi.enterPassenger();
                message.enterTaxi(taxi.getTaxiNumber());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            message.nameThread = passengerNumber;
            message.waitingForTaxi();
            emptySemaphore.release();
        }

        try {
            emptySemaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        message.nameThread = this.passengerNumber;
        fullSemaphore.release();
        taxiSemaphore.release();
    }
}
