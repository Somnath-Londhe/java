import java.util.Scanner;
public class SOM_02_input {

   public static void main(String[] args) {
   System.out.println("This is the user input ");
   Scanner i = new Scanner(System.in);
   System.out.print("Enter the value:- ");
   int a=i.nextInt();
   System.out.print("Enter the value b :-");
   int b=i.nextInt();
   int sum =a+b;
   System.out.println("Enter the sum of digit");
   System.out.println(sum);
   String str=i.nextLine();
   System.out.println(str);
   }
    
} 