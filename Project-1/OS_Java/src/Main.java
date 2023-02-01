import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList<MyThread> threadList = new ArrayList<MyThread>(100);
        Runnable[] myThreads = new Runnable[101];
        for (int i = 0 ; i<=100 ; i++) {
//            threadList.get(i) = new MyThread(i);
            myThreads[i] = new MyThread(i);
            myThreads[i].run();
        }
    }
}
