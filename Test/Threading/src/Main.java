import javax.swing.*;

//import java.util.*;
class ChildThread extends Thread {
    public ChildThread(ThreadGroup tg) {
        super(tg,"child");
    }
    public void run() {
        System.out.println(Thread.currentThread());
        for(int i = 0 ; i <= 100; i++) {
            System.out.println("child : " + i);
        }
    }
}

class ChildThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        for(int i= 0; i <= 100; i++) {
            System.out.println("Child 2: " + i);
        }
    }
}

class base {

}
class derived {

}
public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        ChildThread t = new ChildThread(new ThreadGroup("dummy"));
        t.start();
        ChildThread2 c2 = new ChildThread2();
        Thread t1 = new Thread(c2);
        t1.start();
        for(int i = 0 ; i <= 100; i ++) {
            System.out.println("Main : " + i);
        }

    }

}