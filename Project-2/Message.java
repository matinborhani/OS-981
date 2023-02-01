package message;

public class Message {
    String nameThread;
    public void enterMuseum(){
        System.out.println(nameThread + " enter museum");

    }
    public void waitingForTaxi(){
        System.out.println(nameThread + " waiting for taxi");
    }
    public void enterTaxi(int numTaxi){
        System.out.println(nameThread + " enter to taxi " + numTaxi);
    }
    public void inTaxi(int numTaxi) {
        System.out.println("\t taxi " + numTaxi + " start");
    }
    public void exitTaxi(int numTaxi){
        System.out.println("\t taxi " + numTaxi + " stop");
    }
}
