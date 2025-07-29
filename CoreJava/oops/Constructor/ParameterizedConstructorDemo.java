package oops.constructor;

public class ParameterizedConstructorDemo {
    int roll;
    String name;

    // Parameterized Constructor
    public ParameterizedConstructorDemo(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void display() {
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Creating an object using parameterized constructor
        ParameterizedConstructorDemo student = new ParameterizedConstructorDemo(101, "Akshay");
        student.display();
    }
}
