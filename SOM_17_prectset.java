import java.util.Scanner;

public class SOM_17_prectset {
    public static void main(String[] args) {
        /*
         * ##)question number 1
         * int n=4;
         * for (int i = n; i > 0; i--) {
         * for (int j = 0; j < i; j++) {
         * System.out.print("*");
         * }
         * System.out.println("\n");
         * }
         * }
         */
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter the  n value number :" +i);
            int n = input.nextInt();
            if (n % 2 == 0) {

                System.out.println("this is the even number " + n);
            } else {
                System.out.println("this is the not  even number " + n);
                

            }
        }
    }
}
