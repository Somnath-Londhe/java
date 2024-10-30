import java.util.*;

public class SOM_57_spacific_Exction {
    public static void main(String[] args) {
        int Marks[] = new int[4];
        Marks[0] = 76;
        Marks[1] = 78;
        Marks[2] = 87;
        Marks[3] = 98;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  the array index :=");
        int index = input.nextInt();
        System.out.println("Enter the number :=");
        int number = input.nextInt();
        try {
            System.out.println("the array index is " + Marks[index]);
            System.out.println("the array index is " + Marks[index] / number);
        } catch (ArithmeticException e) {
            System.out.println("This array index  is Not support");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e);

        }

        input.close();

    }
}
