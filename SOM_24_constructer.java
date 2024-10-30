class Cylinder {
    private int redius;
    private int hight;

    // double a = 3.14;
    public Cylinder(int r, int h) {
        redius = r;
        hight = h;

    }

    public int getRadius() {
        return redius;
    }

    public int gethight() {
        return hight;
    }

    public void SetRadius(int r) {
        redius = r;
    }

    public void Sethight(int h) {
        hight = h;
    }

    public double sarface_area() {
        return 2 * 3.14 * redius * hight + 2 * 3.14 * redius * redius;
    }

    public double volume() {

        return 3.14 * redius * redius * hight;

    }

}

class Rectangle {
    private int langth, brigth;

    public Rectangle(int l, int b) {
        langth = l;
        brigth = b;
    }

    public Rectangle() {
        langth = 4;
        brigth = 5;
    }

    public void display() {
        System.out.println("the Ractangle length in " + langth);
        System.out.println("the Ractangle brigth in " + brigth);

    }
}

public class SOM_24_constructer {
    public static void main(String[] args) {
        /*
         * Cylinder c = new Cylinder(2,3);
         * c.SetRadius(2);
         * c.Sethight(6);
         * System.out.println("The Cylinder radius is :=" + c.getRadius());
         * System.out.println("The Cylinder hight is :=" + c.gethight());
         * System.out.println("The vloume of cylinder:=" + c.volume());
         * System.out.println("The surface area of cylinder :=" + c.sarface_area());
         */
        Rectangle r = new Rectangle();
        Rectangle R= new Rectangle(65, 3245);
        r.display(); 
        R.display();
    }
}
