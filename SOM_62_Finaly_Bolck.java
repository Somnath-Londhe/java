/*
 *  Finally Block is run for everyTime
 * 
 */
public class SOM_62_Finaly_Bolck {
    public static int Finally() {
        try {
            int a = 53;
            int b = 2;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This programm is end");
        }
        return 0;
    }

    public static void main(String[] args) {
       System.out.println(Finally());

    }
}