package collection.linkedlist;

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
        demo.removedLast();
        demo.printLinkedList();
        demo.addFirst("Neha");
        demo.addFirst("Girlfriend");
        demo.addLast("Kiran");
        demo.addLast("Simarn");
        demo.addFirst("Pooja");
        demo.addFirst("Pooja");
        demo.printLinkedList();
       System.out.println("Size of the LinkedList : "+demo.getSize());
        demo.addFirst("Prinkya");
        demo.printLinkedList();
        System.out.println("Size of the LinkedList : "+demo.getSize());
        demo.reverseLinkedList();
        demo.printLinkedList();
        System.out.println("Size of the LinkedList : "+demo.getSize());
        demo.reverseLinkedList();
        demo.printLinkedList();
    }
}
