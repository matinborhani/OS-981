public class MyThread implements Runnable {

    int numThread;
    public MyThread(int number) {
        numThread = number;
    }

    @Override
    public void run() {
        System.out.println("Start Thread " + numThread);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End Thread " + numThread);

    }
}
