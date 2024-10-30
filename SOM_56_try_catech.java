/**
 * SOM_56_try_catech
 * 
 */
public class SOM_56_try_catech {

    public static void main(String[] args) {
        int a = 90000;
        int b = 0;
        try {
            int c = a / b;

            System.out.println("The Result is " + c);
        } catch (Exception e) {
            System.out.println("Fail");
            System.out.println(e);
        }
        System.out.println("OK");
    }
}