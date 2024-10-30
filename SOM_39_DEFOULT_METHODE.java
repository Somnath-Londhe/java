interface camara{
    void takesnap();
    void record();
}
interface wyfi{
    String  [] getnetwork ();  
    void connectnrework(String nrework);
}
class cellphone{
    void number_phone(int number){
        System.out.println("The phone number is "+number);
    }
    void pickphone(){
        System.out.println("connnect.....");
    }
}
class my extends cellphone implements camara ,wifi{

}
public class SOM_39_DEFOULT_METHODE {
    public static void main(String[] args) {
        my m =new my();
       System.out.println(m.number_phone(1233243));
        
    }
    
}
