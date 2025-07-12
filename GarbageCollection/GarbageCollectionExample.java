package GarbageCollection;


public class GarbageCollectionExample {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj = null; // Eligible for GC
        System.gc(); // Requesting JVM to run GC
    }
}

class Demo {
    protected void finalize() {
        System.out.println("Garbage collected: Demo object is destroyed");
    }
}
