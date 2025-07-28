import java.util.LinkedList;

public class LinkedListReversed {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedListMehod linkedListMehod = new LinkedListMehod();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedListMehod.printList(linkedList);
    }

    

    
}
class LinkedListMehod{
    public  void printList(LinkedList<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

