interface hello{
    abstract void Hello();
}
interface hii{
    abstract void Hii();
}
class derived5 implements hello,hii{
    public void Hello(){
        System.out.println("Hello Friend");
    }
    public void Hii(){
        System.out.println("Hii Friend");
    }
}
public class SOM_35_inherintce_IN_INTERFACE {
    public static void main(String[] args) {
        derived5 d= new derived5();
        d.Hello();
        d.Hii();
        
    }
}
