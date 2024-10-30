interface Employee5 {
    abstract public void acceept();
    abstract public void display();
    // public void acceept();

    // public void display();

}

class Employee_Datils5 implements Employee5 {
    int id;
    String name;
    int salary;

    public void acceept() {
        id = 1;
        name = "somnath";
        salary = 12343;

    }

    public void display() {
        System.out.println("The Employee id isv :-" + id);
        System.out.println("The Employee name is :-" + name);
        System.out.println("The Employee id is :-" + salary);
    }

}

public class SOM_33_interface {
    public static void main(String[] args) {
        Employee_Datils5 E =new Employee_Datils5();
        E.acceept();
        E.display();
    }
}
