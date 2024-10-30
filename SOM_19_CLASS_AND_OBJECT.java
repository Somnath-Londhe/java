import java.util.Scanner;
public class SOM_19_CLASS_AND_OBJECT {
    public static class student{
    int Roll_no;
    String Name;
    void accept(){
        Scanner input = new Scanner(System.in);
        Roll_no=input.nextInt();
        Name=input.next();
        input.close();
    }
    void display(){
        System.out.println("Roll_no is :"+Roll_no);
        System.out.println("Name is :"+Name);
    }
}

    public static void main(String[] args) {
        // SOM_19_CLASS_AND_OBJECT OBJ = new SOM_19_CLASS_AND_OBJECT();
        student s= new student();
        s.accept();
        s.display();
        // System.out.println(getName()); 
    //    int a=getName()
    }
}
