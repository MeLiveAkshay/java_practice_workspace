package oops.absctraction;

public abstract class MyClass {
    
    // Concrete (fully implemented) method
    public void call() {
        System.out.println("Calculating the result");
    }

    // Abstract method (no body, must be overridden)
    abstract public void rocket();
}
