/*
 * throws :-
 * i)The Throws function Stop 
 * ii)
 */
class NegtiveReduis extends Exception {
    public String toString() {
        return "Redius connt be Negtive";
    };

    public String getMessage() {
        return "Redius connt be Negtive";
    };

}

public class SOM_61_throws {

    public static double area(int r) throws NegtiveReduis {
        if (r < 0) {
            throw new NegtiveReduis();
        }
        double rusult = Math.PI * r * r;
        return rusult;

    }

    public static int divide(int a, int b) throws ArithmeticException {
        int ruselt = a / b;
        return ruselt;
    }

    public static void main(String[] args) {
        // try {
        // int c = divide(232, 0);
        // System.out.println(c);

        // } catch (Exception e) {
        // System.out.println("Exception " + e);
        // }
        try {
            double A = area(-4);
            System.out.println(A);

        } catch (NegtiveReduis e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
