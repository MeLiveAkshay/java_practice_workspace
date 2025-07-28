package collection.linkedlist;



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

    public void removedLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secendLastNode=head;
        Node lastNode=head;
        while(lastNode.next!=null)
        {
            secendLastNode=lastNode;
            lastNode=lastNode.next;
        }
        secendLastNode.next=null;
    }
    public void removeDuplicates()
    {
        if(head==null || head.next==null)
        {
            System.out.println("List is empty or has only one node");
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            if(currentNode.data.equals(currentNode.next.data)){
                currentNode.next=currentNode.next.next;
            }
            else{
                currentNode=currentNode.next;
            }
            // Implementation needed here, for now just leave it empty or add logic later
        }
        System.out.println("Duplicates removed successfully");
        // Implementation needed here, for now just leave it empty or add logic later
    }

    public int getSize()
    {
        int size=0;
        Node currentNode=head;
        while(currentNode!=null)
        {
            size++;
            currentNode=currentNode.next;
        }
        return size;
    }

    public void reverseLinkedList()
    {
        if(head==null || head.next==null)
        {
            System.out.println("List is empty or has only one node");
            return;
        }

        Node prev=head;
        Node current=head.next;
       
        while(current!=null){
           Node  nextNode=current.next;
           current.next=prev;  // Reverse the link
           //update the previous and current pointers
           prev=current;
           current=nextNode;
        }
        head.next=null;  // Make the last node as null to break the link
        head=prev;  // Update the head pointer to the new head of the reversed list
        System.out.println("Reversed linked list is: ");
        
    }

}
