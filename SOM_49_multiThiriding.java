/*
 * creating a two type for Thread
 *      i)Extending Thread class
 *      ii)runnable interface
 * 
*/
/* 
 * concurrence and parallelism
 * concurrence :
 * i)at a time one time
 * parallelism :
 * ii)multipul work 
 */
class mythread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("MyThread1 in running");
            System.out.println("I Am happy");

        }
    }
}

class mythread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("MyThread1 in running");
            System.out.println("I am sad 😒");

        }
    }
}

public class SOM_49_multiThiriding {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
    }
}
