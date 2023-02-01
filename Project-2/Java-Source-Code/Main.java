package subp2;//Masoume Sheykhzade ... 9641553
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int numTaxi = input.nextInt();
        int numPassenger = input.nextInt();
        //Passenger[] passengers = new Passenger[numPassenger];
        //Taxi[] taxies = new Taxi[numTaxi];

//        for (int i = 0; i < numPassenger; i++) {
//            passengers[i] = new Passenger();
//        }
//        for (int i = 0; i < numTaxi; i++) {
//            taxies[i] = new Taxi();
//        }

        for (int i = 0; i < numPassenger; i++) {
            Thread thread = new Thread(new Passenger());
            thread.setName(i + " ");
            thread.start();
        }
        for (int i = 0; i < numTaxi; i++) {
            Thread thread = new Thread(new Taxi());
            thread.setName(i + " ");
            thread.start();
        }
    }
}
