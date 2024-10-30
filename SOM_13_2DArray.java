public class SOM_13_2DArray {
    public static void main(String[] args) {
        /********************************************************************************
         * float [] mark={12.3f,23.4f,43.4f,54.5f,3.3f};
         * float sum=0;
         * for (float Element : mark) {
         * sum= sum + Element;
         * }
         * 
         * System.out.print("This sum of array :");
         * System.out.println(sum);
         */
        /*
         * *****************************************************************************
         * ***
         * float[] mark = { 12.3f, 23.4f, 43.4f, 54.5f, 3.3f };
         * float sum = 12.3f;
         * for (float Element : mark) {
         * if (sum == Element) {
         * System.out.println("true");
         * break;
         * } else {
         * System.out.println("Not a element in array :");
         * break;
         * }
         * }
         */
        /*
         * float [] mark={12.3f,23.4f,43.4f,54.5f,3.3f};
         * float sum=0;
         * for (float Element : mark) {
         * sum= sum + Element;
         * }
         * 
         * System.out.print("This Avarage of the mark of array : "+sum/mark.length);
         */
        /**************************************************************************** 
         
        int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] mat2 = { { 7, 8, 5 }, { 10, 11, 12 } };
        int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] +" ");
            }
               System.out.print("\n");
        }
        
        */
       
        // int []revers = {1,2,3,4,5};
        // for (int i = i-1;i < revers.length; i++) {
        //     System.out.println(revers[i]);
        // }
        

    // }
}
