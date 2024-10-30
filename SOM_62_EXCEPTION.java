import java.util.*;

public class SOM_62_EXCEPTION {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value A");
        int a = input.nextInt();
        System.out.println("Enter the value B");
        int b = input.nextInt();
        int c = 0;
        c = a / b;
        try {
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        input.close();
    }
}
