package assignment.assignment__5;

// Parent class
class Parent {
    void showMessage() {
        System.out.println("This is the parent class.");
    }
}

// Child class demonstrating single inheritance
public class SingleInheritance extends Parent {

    void displayMessage() {
        System.out.println("This is the child class (SingleInheritance).");
    }

    public static void main(String[] args) {
        SingleInheritance obj = new SingleInheritance();

        // Calling method from parent class
        obj.showMessage();

        // Calling method from child class
        obj.displayMessage();
    }
}
