// import java.util.*;

class ThreadRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("run thread 1");
        }
    }

}
class ThreadRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.println("run thread 2");
        }
    }

}

public class SOM_50_thread_runneble {
    public static void main(String[] args) {
        ThreadRunnable t = new ThreadRunnable();
        Thread s = new Thread(t);

        ThreadRunnable2 t1 = new ThreadRunnable2();
        Thread s2 = new Thread(t1);
        s.start();
        s2.start();

    }
}
