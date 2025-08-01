package Map;

public class Employee {
    private int id;
    private String name;
    private float salary;


    public Employee(){

    }


    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


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


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }


    @Override
    public int hashCode() {
        
        return id;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee){
            Employee employee = (Employee) obj;
            if(this.name.equals(employee.name) && this.salary==employee.salary){
                return true;

            }
        }
        return false;
    }

    
    

    
}
