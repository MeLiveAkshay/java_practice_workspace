package oops.Constructor;

public class ConstructorOverloading {
    int id;
    String name;

    // Default constructor
    public ConstructorOverloading() {
        id = 0;
        name = "Unknown";
    }

    // Constructor with one parameter
    public ConstructorOverloading(int id) {
        this.id = id;
        this.name = "Unknown";
    }

    // Constructor with two parameters
    public ConstructorOverloading(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(101);
        ConstructorOverloading obj3 = new ConstructorOverloading(102, "Akshay");

        System.out.println("Default Constructor:");
        obj1.display();

        System.out.println("Single Parameter Constructor:");
        obj2.display();

        System.out.println("Two Parameter Constructor:");
        obj3.display();
    }
}
