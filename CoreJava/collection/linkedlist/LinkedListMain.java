public class LinkedListMain {
public static void main(String[] args)
    {
        LinkedListDemo demo=new LinkedListDemo();
        demo.addFirst("This");
        demo.addFirst("Is ");
        demo.addFirst("Neha");
        demo.addFirst("Girlfriend");
        demo.addLast("Kiran");
        demo.addLast("Simarn");
        demo.printLinkedList();
        demo.removeFirst();
        demo.printLinkedList();
        
    }
}
