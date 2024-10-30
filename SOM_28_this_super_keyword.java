class Ekclass {
    int a;

    public int getvalue() {
        return a;
    }

    Ekclass(int a) {
        this.a = a;

    }

    public int one() {
        return 1;
    }
}
public class SOM_28_this_super_keyword {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(4);
        System.out.println(e.getvalue());
    }
}
