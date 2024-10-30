class A {
    public void math() {
        System.out.println("I Am Class `A`");
    }
}

class B extends A {
    // @Override
    public int math(int a) {
        System.out.println("I Am Class `b`");
        return a;
    }

    public void math1() {
        System.out.println("I Am Class `B`");
    }
}

public class SOM_29_Mathed_overloading {
    public static void main(String[] args) {
        // System.out.println("Run the programm:");
        // A a=new A();
        // a.math();
        B b = new B();
        System.out.println(b.math(5));
        b.math();
        b.math1();
    }
}
