import java.util.Scanner;
public class SOM_03_Q {
    public static void main(String[] args) {
        System.out.println();
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the Maek subject 1 :");
        int m1=i.nextInt();
        System.out.print("Enter the Maek subject 1 :");
        int m2=i.nextInt();
        System.out.print("Enter the Maek subject 1 :");
        int m3=i.nextInt();
        System.out.print("Enter the Maek subject 1 :");
        int m4=i.nextInt();
        System.out.print("Enter the Maek subject 1 :");
        int m5=i.nextInt();
        int total =m1+m2+m3+m4+m5;
        System.out.print("Enter the total mark : ");
        System.out.println(total);
        int par = total / 5;
        System.out.print("Enter the subject of per ");
        System.out.print(par);
        System.out.print("%");

    }
}
