package assignment.assignment__12.problem__5;
import java.util.*;

// Employee class
class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // toString method for printing
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: ₹" + salary;
    }
}

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        // Adding sample employees
        employeeList.add(new Employee(101, "Alice", 45000));
        employeeList.add(new Employee(102, "Bob", 30000));
        employeeList.add(new Employee(103, "Charlie", 55000));
        employeeList.add(new Employee(104, "David", 40000));

        // Sorting using Comparator by salary
        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.salary, e2.salary);
            }
        });

        // Displaying sorted employees
        System.out.println("Employees sorted by salary:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
