import java.util.Scanner;

public class SOM_10_IF_ELSE_IF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value :- ");
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.print("The A is even :- ");
            System.out.println(a);
        }else{
            System.out.println("This is the Not A even number 😒 ");

        }
        input.close();
    }
}
