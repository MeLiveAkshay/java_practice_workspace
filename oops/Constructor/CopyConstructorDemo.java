package oops.Constructor;

public class CopyConstructorDemo {
    int id;
    String name;

    // Parameterized constructor
    public CopyConstructorDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    public CopyConstructorDemo(CopyConstructorDemo other) {
        this.id = other.id;
        this.name = other.name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        CopyConstructorDemo original = new CopyConstructorDemo(101, "Akshay");
        CopyConstructorDemo copy = new CopyConstructorDemo(original); // using copy constructor

        System.out.println("Original Object:");
        original.display();

        System.out.println("Copied Object:");
        copy.display();
    }
}
