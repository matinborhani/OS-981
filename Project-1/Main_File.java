import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        MyThread[] m = new MyThread[num];
        Formatter[] f = new Formatter[num];
        for (int i = 0; i < num; i++) {
            f[i]= new Formatter("J:\\uni\\981\\سیستم عامل\\PRJ\\Q2\\Thread"+(i+1)+".txt");
            m[i]=new MyThread(i+1,f[i]);
            m[i].start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException s) {
                s.printStackTrace();
            }
        }
    }
}
