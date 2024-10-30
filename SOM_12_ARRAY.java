import java.util.Scanner;
public class SOM_12_ARRAY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] student = new int[5];
        System.out.println("Enter the array Element : ");
        for (int i = 0; i < 5; i++) {
           if (true) {
            student[i] = input.nextInt();
           } 
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("The display the array Element : ");
            System.out.println(student[i]);
        }
        
    }
}
