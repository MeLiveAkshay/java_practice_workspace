package corejava.oops.constructor;

public class MethodOverloading {

    // Method with no parameters
    public void show() {
        System.out.println("Show method with no parameters.");
    }

    // Method with one int parameter
    public void show(int a) {
        System.out.println("Show method with one int: " + a);
    }

    // Method with one String parameter
    public void show(String name) {
        System.out.println("Show method with one String: " + name);
    }

    // Method with two parameters
    public void show(int a, String name) {
        System.out.println("Show method with int and String: " + a + ", " + name);
    }

    // Method with same parameters but different order
    public void show(String name, int a) {
        System.out.println("Show method with String and int: " + name + ", " + a);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        
        obj.show();
        obj.show(10);
        obj.show("Akshay");
        obj.show(101, "Rahul");
        obj.show("Ravi", 202);
    }
}
