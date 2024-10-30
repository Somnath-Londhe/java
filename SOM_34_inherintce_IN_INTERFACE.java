interface hello {
    abstract void Hello();
}

interface hii {
    abstract void Hii();
}

class derived implements hello, hii {
    public void Hello() {
        System.out.println("Hello Friend");
    }

    public void Hii() {
        System.out.println("Hii Friend");
    }
}

public class SOM_34_inherintce_IN_INTERFACE {
    public static void main(String[] args) {

        derived d = new derived();
        d.Hello();
        d.Hii();
    }
}