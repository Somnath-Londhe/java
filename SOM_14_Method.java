public class SOM_14_Method {
  void  greaterthen(int a,int b){ 
   if (a>b) {
    System.out.println("The a is greater :"+ a);
    // return a;
    
   }else{
    System.out.println("The b is greater :"+ b);
    // return b;
   }
}
    public static void main(String[] args) {
        // greaterthen(11,2); method 1
        // method 2 
        // the stastic using the  keyworzxA
        SOM_14_Method obj1 = new  SOM_14_Method();
        obj1.greaterthen(2, 4);
    }
}
