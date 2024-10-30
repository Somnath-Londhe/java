/*
 * 
 */
class myclass1 extends Thread {
    public myclass1(String name) {
        // System.out.println(name);
        super(name);
    }

    public void run() {
        // int id = 12;
        while (true) {

            System.out.println("Thank you :=" + getName());
        }
    }
}

public class SOM_52_THREAD_Priority {
    public static void main(String[] args) {
        myclass1 t = new myclass1("somnath--------->");
        myclass1 t1 = new myclass1("somnath1===========>>");
        myclass1 t2 = new myclass1("somnath2");
        myclass1 t3 = new myclass1("somnath3");
        myclass1 t4 = new myclass1("somnath4 (VERY IMP)");
        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t4.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);

    }
}
