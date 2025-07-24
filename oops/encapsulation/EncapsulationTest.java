package oops.encapsulation;

public class EncapsulationTest {
    private int id;
    private String name;
    private float salary;

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Main method to test
    public static void main(String[] args) {
        EncapsulationTest emp = new EncapsulationTest();
        emp.setId(101);
        emp.setName("Akshay");
        emp.setSalary(55000.75f);

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}
