class phone{
  public void morning(){
    System.out.println("Good Morning`have a nice day");
  }
  public void name(){
    System.out.println("My Name is Java");
  }
}
class Smartphone extends phone {
    public void swaget(){
        System.out.println( "Swaget hai Appaka");
    }
    public void name(){
        System.out.println("My name is java in class Two");
    }

}
public class SOM_30_Dinimiy_Methode {
public static void main(String[] args) {
    // phone o=new phone();
    // o.name();
    // o.morning();
    phone obj =new Smartphone();
    obj.name();
}
    
}