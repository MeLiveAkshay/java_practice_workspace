package corejava.oops.Interface;

// Interface: defines a contract
interface Flyable {
    void fly();
}

// Abstract class: defines common behavior
abstract class Bird {
    void eat() {
        System.out.println("Bird is eating");
    }

    abstract void sound(); // abstract method
}

// Concrete class that uses both
public class Sparrow extends Bird implements Flyable {

    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void sound() {
        System.out.println("Sparrow chirps");
    }

    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.eat();       // from abstract class
        s.sound();     // overridden from Bird
        s.fly();       // from interface
    }
}
