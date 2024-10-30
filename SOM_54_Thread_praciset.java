class Good extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning ");
        }
    }
}

class Well extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            System.out.println("Wellcome ");
        }
    }
}

public class SOM_54_Thread_praciset {
    public static void main(String[] args) {
        Good t1 = new Good();
        Well t2 = new Well();
        t1.setPriority(3);
        t2.setPriority(5);
        System.out.println(t1.getPriority());
        System.out.println(t1.getPriority());
        t1.start();
        t2.start();
        // System.out.println(t2.currentThread().getPriority());
        // System.out.println(t2.getState());//runnable state in Thread
        

    }
}
