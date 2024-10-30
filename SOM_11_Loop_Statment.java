import java.util.Scanner;

public class SOM_11_Loop_Statment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int i=1;
       
        while (i <= 10){
           
            System.out.println(a*i);
            i++;
        }
    }

}
