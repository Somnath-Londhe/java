/*
 * life cycle in Thread
 * 
 */
class myclass extends Thread {
    public myclass(String name) {
       System.out.println(name);
    }

    public void run() {
        int id=12;
        System.out.println("Thank you");
        // while (true) {

        //     System.out.println("Im A Thread ");
        // }
    }
}

public class SOM_51_thread_life_cycle {
    public static void main(String[] args) {
        myclass t = new myclass("somnath");
        myclass t2 = new myclass("shubham");
        myclass t3 = new myclass("---");
        t.start();
        t2.start();
        t3.start();
        System.out.println("The is somnath id "+t.getId());
        System.out.println("The is shubham id "+t2.getId());
        System.out.println("The is s---- id "+t3.getId());
        // t.run();
    }
}
