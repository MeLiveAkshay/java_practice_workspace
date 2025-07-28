package collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample
{
    public static void main(String[] args)
    
    {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("!");
        linkedList.add("This");
        linkedList.add("is");
        linkedList.add("a");
        linkedList.add("linked");
        linkedList.add("list");
        linkedList.add("in");
        linkedList.add("Java");
        System.out.println("Original Linked List: " + linkedList);
        System.out.println("Size of Linked List: " + linkedList.size());


       for(String str: linkedList)
       {
            System.out.print(str + " -> ");
       }
       System.out.println("null");

       linkedList.addFirst("This");
       linkedList.addLast("is");
       System.out.println("Linked List after adding elements at both ends: " + linkedList);
       System.out.println("Size of Linked List after adding elements: " + linkedList.size());
       linkedList.removeFirst();
       linkedList.removeLast();
       System.out.println("Linked List after removing first and last elements: " + linkedList);
       System.out.println("Size of Linked List after removing elements: " + linkedList.size());
       

       linkedList.remove("a");
       System.out.println("Linked List after removing element 'a': " + linkedList);
       System.out.println("Size of Linked List after removing element: " + linkedList.size());

       linkedList.remove(4);
       System.out.println("Linked List after clearing all elements: " + linkedList);
       System.out.println("Size of Linked List after clearing elements: " + linkedList.size());

       Collections.reverse(linkedList);
        System.out.print("\nReversed Linked List: ");
        for (String str : linkedList)
        {
            System.out.print(str + " -> ");
        }
        System.out.println("null");
    }

}
