package GarbageCollection;


public class GarbageCollectionExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj = null; // Eligible for GC
        System.gc(); // Requesting JVM to run GC
    }
}


