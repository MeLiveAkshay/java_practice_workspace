

public class LinkedListDemo {
    public Node head;
    public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        System.out.println("First node removed");
    }

    public void addLast(String String)
    {
        Node newNode=new Node(String);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;

        }
        lastNode.next=newNode;
    }
    /**
     * Adds a new node with the given string data to the end of the linked list.
     *
     * @param String The string data to be stored in the new node.
     */
    
    public void printLinkedList()
    {
        Node currentNode=head;
        while(currentNode!=null)
        {
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println(" Null ");


    }

    public void addFirst(String string) 
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

    public void removeLast()
    {
        if(head==null)
        {
            System.out.println(" List is empty");
            return;
        }
        
        Node secondLast=head;
        Node lastNode=head.next;


        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
    }

}
