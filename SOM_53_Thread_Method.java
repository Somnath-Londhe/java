class Method extends Thread {
    int i = 1;

    public void run() {
        while (true) {
            System.out.println("Mathod 1");         
            // Thread.sleep(445);
            i++;

        }
    }

}

class Method1 extends Thread {
    int i = 1;

    public void run() {
        while (true) {
            System.out.println("Mathod 2");
            i++;
        }
    }
}

public class SOM_53_Thread_Method {
    public static void main(String[] args) {
        Method m = new Method();
        // Method m2 = new Method();
        Method1 m1 = new Method1();
        m.start();
        try {

            m.join();

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        m1.start();
    }
}
