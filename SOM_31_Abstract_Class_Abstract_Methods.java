// The Abstract is not  cerate a object 
abstract class base1 {
    
    abstract public void hello();
    abstract public void greet();

}

class dirived extends base1 {

    public void greet() {
        System.out.println("Good Morning");
    }

    public void hello() {
        System.err.println("hello");
    }

    public void greet2() {
        System.out.println("Good Aftermim");
    }

}
class SOM_31_Abstract_Class_Abstract_Methods {
    public static void main(String[] args) {
        // da d2= new da();
        // d2.th();
        dirived d1 = new dirived();
        d1.greet();
        // d1.greet2();
        d1.hello();
    }
}