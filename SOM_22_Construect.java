class student{
    int id ;
    String name;
    public student(int i ,String n){
        id=i;
        name=n;
    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
public class SOM_22_Construect {
  public static void main(String[] args) {
    student s= new student(1, "somnath");
    s.display();
  }
}
