public class LinkedListDemo {
    public Node head;
    public static void main(String[] args)
    {
        LinkedListDemo demo=new LinkedListDemo();
        demo.addFirst("This");
        demo.addFirst("Is ");
        demo.addFirst("Neha");
        demo.addFirst("Girlfriend");
        demo.printLinkedList();
        
    }

    private void printLinkedList()
    {
        Node currentNode=head;

        while(currentNode!=null)
        {
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println(" Null ");


    }

    private void addFirst(String string) 
    {
        Node newNode=new Node(string);
        if(head==null)
        {
            head=newNode;
            return;

        }
        newNode.next=head;
        head=newNode;
        // Implementation needed here, for now just leave it empty or add logic later
    }


}
