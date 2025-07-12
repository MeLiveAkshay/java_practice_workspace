package objectClass;

/**
 * The Employee class represents a model of an employee with basic attributes:
 * - ID
 * - Name
 * - Salary
 * 
 * It includes:
 * - Constructors (default and parameterized)
 * - Getters and setters
 * - An overridden hashCode() method for use in hash-based collections
 */
public class Employee {

    // Private fields to store employee details
    private int id;           // Unique employee ID
    private String name;      // Employee's full name
    private float salary;     // Employee's salary

    /**
     * Default constructor.
     * Initializes an empty Employee object.
     * Useful when setting fields later using setters.
     */
    public Employee() {
        // No specific initialization; fields remain with default values.
    }

    /**
     * Parameterized constructor.
     * Initializes the Employee object with provided id, name, and salary.
     *
     * @param id     the employee ID
     * @param name   the employee name
     * @param salary the employee salary
     */
    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // ======== Getters and Setters ========

    /**
     * Returns the employee's ID.
     *
     * @return the ID of the employee
     */
    public int getId() {
        return id;
    }

    /**
     * Updates the employee's ID.
     *
     * @param id the new ID to be set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the employee's name.
     *
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Updates the employee's name.
     *
     * @param name the new name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the employee's salary.
     *
     * @return the salary of the employee
     */
    public float getSalary() {
        return salary;
    }

    /**
     * Updates the employee's salary.
     *
     * @param salary the new salary to be set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
            return false;
        return true;
    }

    // ======== hashCode() Method ========

    /**
     * Overrides the hashCode() method from the Object class.
     *
     * The hash code is used in hashing-based collections (like HashMap or HashSet)
     * to determine the bucket location of an object.
     *
     * ✅ This implementation uses only the `id` field to generate the hash code.
     * This assumes that `id` is unique for each employee (like an employee number).
     *
     * 📌 Important: If you override `equals()`, you must override `hashCode()` too,
     * and ensure both use the same fields for comparison.
     *
     * @return an integer hash code based on the employee's ID
     */
   @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Float.floatToIntBits(salary);
        return result;
    }
}
