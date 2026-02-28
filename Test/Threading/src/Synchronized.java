import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.*;
import java.util.function.Function;


class Printer {
    // either use synchronized keyword
    public void print(String msg) throws InterruptedException{
        System.out.print("[");
        Thread.sleep(2000);
        System.out.print(msg);
        System.out.println("]");
    }
}
class Writer extends Thread {
    Printer p;
    String mgs;
    public Writer(Printer p, String msg) {
        super();
        this.mgs = msg;
        this.p = p;
    }
    public void run() {
        try {
            synchronized (p) {
                p.print(mgs);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Synchronized {
    public static void main(String args[]) {
        Printer p = new Printer();

        Writer w1  =  new Writer(p, "JAVA");
        Writer w2  =  new Writer(p, "Threads");
        w1.start();
        w2.start();
        ExecutorService single = Executors.newSingleThreadExecutor();
        single.submit(() -> {
           for(int i = 0 ; i <= 40; i++) {
               System.out.println("thread " + i);
           }
        });


        Callable<Integer> call = () -> {
            Thread.sleep(4000);
            return  new Random().nextInt();
        };
        Future<Integer> future = single.submit(call);
    }
}
