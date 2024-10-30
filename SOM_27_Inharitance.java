class Employee3{
    int E_id;
    String name;
    int salary;
    Employee3(int i,String n,int s){
        this.E_id=i;
        this.name=n;
        this.salary=s;
    }
    
}
class Employee_Deatils extends Employee3{
    Employee_Deatils(int i,String n,int s){
        super(i,n,s);
        this.E_id=i;
        this.name=n;
        this.salary=s;
        
    }
   
      public  void display(){
        System.out.println("The Employee id is :"+E_id);
        System.out.println("The Employee id is :"+name);
        System.out.println("The Employee id is :"+salary);

       }
}
public class SOM_27_Inharitance {
    public static void main(String[] args) {

        Employee_Deatils  E = new Employee_Deatils(1,"somnath",1321);
        E.display();

    }
    
}
