package objectClass;

/**
 * The Employee class represents a simple model of an employee with basic details
 * like ID, name, and salary. It includes constructors, getters, and setters
 * for object creation and manipulation.
 */
public class Employee {
    // Private member variables to store employee details
    private int id;
    private String name;
    private float salary;

    /**
     * Default constructor.
     * Initializes an empty Employee object.
     */
    public Employee() {
        // No initialization logic here
    }

    /**
     * Parameterized constructor.
     * Allows creation of an Employee object with specified values.
     *
     * @param id     the employee's ID
     * @param name   the employee's name
     * @param salary the employee's salary
     */
    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Gets the employee ID.
     *
     * @return the ID of the employee
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the employee ID.
     *
     * @param id the new ID of the employee
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the employee name.
     *
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee name.
     *
     * @param name the new name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the employee salary.
     *
     * @return the salary of the employee
     */
    public float getSalary() {
        return salary;
    }

    /**
     * Sets the employee salary.
     *
     * @param salary the new salary of the employee
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }


    @Override
    public int hashCode()
    {
        return id ;
    }
}
