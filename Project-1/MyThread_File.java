import java.util.Formatter;
import java.util.Random;

public class MyThread extends Thread {
    private Random r;
    private int id;
    private Formatter f;
    MyThread(int tid,Formatter ff) {
        id=tid;
        r=new Random();
        f=ff;
    }

    public void run(){
        int rand=r.nextInt(2000)+1000;
        f.format("Start Thread %d\n",id);
        try {
            Thread.sleep(rand);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        f.format("End Thread %d",id);
        f.close();
    }
}
