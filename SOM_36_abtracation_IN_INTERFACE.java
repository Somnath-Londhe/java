interface bike {
    void brack();

    int a = 35;

    void bikename();

    void speedup(int x);
}

class bike_information implements bike {
    public void name() {
        System.out.println("BMW");
    }

    public void brack() {
        System.out.println("Barck na hai");

    }

    void speedup() {
        System.out.println(500);
    }
}

public class SOM_36_abtracation_IN_INTERFACE {
    public static void main(String[] args) {
        bike_information d = new bike_information();
        d.name();
        d.brack();
        d.speedup();

    }

}
