package subp2;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Taxi extends Thread {
    public Taxi(){}
    int taxiNumber;
    private Semaphore semaphore, passengerSemaphore;
    Semaphore emptySemaphore = new Semaphore(1);
    Semaphore fullSemaphore = new Semaphore(0);
    Random random = new Random();
    Message message = new Message();
    public Taxi(int taxiNumber, Semaphore semaphore, Semaphore passengerSemaphore, Semaphore emptySemaphore, Semaphore fullSemaphore) {
        this.taxiNumber = taxiNumber;
        this.semaphore = semaphore;
        this.passengerSemaphore = passengerSemaphore;
        this.emptySemaphore = emptySemaphore;
        this.fullSemaphore = fullSemaphore;
    }


    void enterPassenger() throws InterruptedException {
        semaphore.acquire();
    }
    void exitPassenger(){
        semaphore.release();
    }
    boolean taxiFull(){
        if(emptySemaphore.tryAcquire())
            return false;
        else
            return true;
    }
    public int getTaxiNumber() {
        return taxiNumber;
    }


    @Override()
    public void run(){
        while (true){
            try {
                fullSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {//waiting for passenger
                passengerSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            message.enterTaxi(taxiNumber);
            emptySemaphore.release();
            message.inTaxi(taxiNumber);


            int taxiWaitTime = random.nextInt(2)+1;
            try {//taxi too raahe
                Thread.sleep(1000 * taxiWaitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            exitPassenger();

            message.exitTaxi(taxiNumber);
        }
    }
}
