public class SOM_15_VARIBLE {

    static void sum(int a, int b) {
        // arrauge is limit;
        int c = a + b;
        System.out.println("The sum of value : " + c);

    }
    static int  sum(int ...arr){
        //not a limit the array  and paramiter 
        int sum =0;
        for (int i : arr) {
            sum += i;
        }
        return sum;

    }

    public static void main(String[] args) {
        // sum(2, 4);
        // SOM_15_VARIBLE OBJ = new SOM_15_VARIBLE(); 
        // OBJ.sum(4, 665);
        int a = sum(1,2,3,4,6,7,89);
       System.out.println(a);
    }
}
