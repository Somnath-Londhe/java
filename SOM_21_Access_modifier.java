class Employee1 {
  private int id;
  private String name;

  public void setName(String n) {
    
    name = n;
  }

  public String getName() {
    return name;
  }

  public void Setid(int i) {
    id = i;
    
  }

  public int getId() {
    return id;
  }
}

public class SOM_21_Access_modifier {
  public static void main(String[] args) {

    Employee1 E = new Employee1();
    E.Setid(1);
    E.setName("somnath");
    System.out.println(E.getId());
    System.out.println(E.getName());

  }
}
