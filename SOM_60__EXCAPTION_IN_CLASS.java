
/**
 * SOM_60__EXCAPTION_IN_CLASS
 */
import java.util.*;

class MyExcption extends Exception {
    @Override
    public String toString() {
        return "I Am A tosting()";

    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "I Am A getmasage()";
    }
}

public class SOM_60__EXCAPTION_IN_CLASS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number := ");
        int a = input.nextInt();
        if (a < 9) {
            try {
                // throw new MyExcption();
                throw new ArithmeticException("ArithmeticException");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finish");
            }

        }

    }
}