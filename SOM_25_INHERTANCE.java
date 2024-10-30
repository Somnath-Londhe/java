class Base {
    int x;

    public int accept() {
        return x;

    }

    public void display(int x) {
        this.x = x;
        System.err.println(x);
    }

}
class derived extends Base {
    int y;

    public int accept1() {
        return y;

    }

    public void display2(int y) {
        this.y = y;
        System.err.println(y);

    }
}

public class SOM_25_INHERTANCE {
    public static void main(String[] args) {
   derived D=new derived();
   D.accept();
   D.accept1();
   D.display(4);
   D.display2(6);
   
    }
}
    