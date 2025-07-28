package assignment.assignmnet__10;

import java.util.PriorityQueue;

public class PriorityQueueDemo 
{
	public static void main(String[] args) 
	{

		// create a PriorityQueue object
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(10);
		priorityQueue.add(new Integer(20));
		priorityQueue.add(20);
		priorityQueue.add(30);
		priorityQueue.add(50);
		priorityQueue.add(70);
		System.out.println("PriorityQueue pq : " + priorityQueue);
		System.out.println("Peek : " + priorityQueue.peek());
		System.out.println("Removed - poll(): " + priorityQueue.poll());
		System.out.println("PriorityQueue after poll() : " + priorityQueue);
		
		
		
		priorityQueue.remove(30);
		System.out.println("PriorityQueue after removal of 30 using remove() : " + priorityQueue);
		System.out.println("element() : " + priorityQueue.element());
		System.out.println("PriorityQueue after all operations : " + priorityQueue);
		
		
		
		
		// PriorityQueue of Employee object
		PriorityQueue<Employe> queue = new PriorityQueue<>();
		queue.add(new Employe(801, "Akshay", 2500000));
		queue.add(new Employe(804, "Vivek", 4000000));
		queue.add(new Employe(803, "Sohan", 300000));
		queue.add(new Employe(802, "Pankak", 400000));
		System.out.println("Employe PriorityQueue : " + queue);
	}
}
