import java.lang.reflect.Method;
import java.util.Scanner;
public class SOM_13_ARRAY {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        String [] studen_name = {"somnath","omkar","shubham","siddu"};
        System.out.print("The length of the array: ");
        // System.out.println(studen_name.length);
        for (int i = 0; i < 4; i++) {
            System.out.println(studen_name[i]);   
        }
        // Method : 2
        // for ( String Element: studen_name) {
        //     System.out.println(Element);
        // }
    }
    
}