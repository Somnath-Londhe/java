interface simple {
    void math1();

    void math2();
}

interface hard extends simple {
    void mant3();

    void mant4();
}

class Myclass implements hard {
    public void mant1() {
        System.out.println("mant1");
    }

    public void mant2() {
        System.out.println("mant2");
    }

    public void mant3() {
        System.out.println("mant3");
    }

    public void mant4() {
        System.out.println("Math4");
    }
}

public class SOM_40_inhertance_interface {
    public static void main(String[] args) {
        Myclass m = new Myclass();
        m.mant1();
        m.mant2();
        m.mant3();
        m.mant4();
    }

}

