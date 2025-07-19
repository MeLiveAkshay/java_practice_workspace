package GarbageCollection;

public class Demo {
    protected void finalize() {
        System.out.println("Garbage collected: Demo object is destroyed");
    }
    
}
