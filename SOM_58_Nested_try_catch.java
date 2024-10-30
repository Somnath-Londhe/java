// import java.util.*;

public class SOM_58_Nested_try_catch {
    public static void main(String[] args) {
        try {
            System.out.println("The try ");
            try {
                System.out.println("The Nested try");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("the Array index in Not Access ");
            }   
        } catch (Exception e) {
            System.out.println("The try cache");
            System.out.println(e);
        }
    }
}
