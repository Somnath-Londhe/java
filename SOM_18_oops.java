import java.util.Scanner;

public class SOM_18_oops {
    public static class som {
        Scanner input = new Scanner(System.in);
        // final int x=12;
        String name = input.next();

        public void printName() {
            System.out.println("Name: " + name);
        }
    }

    public static void main(String[] argu) {
        Scanner input = new Scanner(System.in);

        // Main obj= new Main();
        // som obj = new som();
        // obj.x=10;
        // System.out.println(obj.x);
        som s = new som();
        s.printName();
    }

}
