import java.util.Scanner;

public class SOM_09_string_Ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = input.nextLine();
        System.out.println(name.toLowerCase());
        System.out.println(name.replace(" ", "_"));
        System.out.println(name.replace("<|name|>", "Somanth Londhe"));
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));
        input.close();
    }
}
