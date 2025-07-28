package corejava.oops.absctraction;

public class TestAbstraction extends MyClass {

    @Override
    public void rocket() {
        System.out.println("Launching the rocket...");
    }

    public static void main(String[] args) {
        TestAbstraction obj = new TestAbstraction();
        obj.call();    // inherited concrete method
        obj.rocket();  // overridden abstract method
    }
}
