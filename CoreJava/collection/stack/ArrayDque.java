package collection.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDque {
    public static void main(String[] args) {
        Deque <Integer> deque=new ArrayDeque<>();
        deque.add(56);
        deque.addFirst(58);//add element at front end 
        deque.addLast(85);//add element at (last) rare end 
        deque.add(56);
        deque.addLast(85);
        deque.addFirst(100);
        deque.addFirst(200);
        System.out.println(deque);
        System.out.println("ArrayDeque Element : "+deque);
        System.out.println("---------------------------");
        //get element from fornt end 
        System.out.println("Get 1st Element : "+deque.getFirst());
        System.out.println("Get 1st Element : "+deque.peekFirst());
        System.out.println("Get 1st Element : "+deque.pollFirst());
        System.out.println("get 1st elemt after poll : "+deque.getFirst());
        System.out.println("ArrayDeque Element : "+deque);
        System.out.println("---------------------------");
        //get the element from the rare end
        System.out.println("Get 1st Element : "+deque.getLast());
        System.out.println("Get 1st Element : "+deque.peekLast());
        System.out.println("Get 1st Element : "+deque.pollLast());
        System.out.println("---------------------------");
        System.out.println("get 1st elemt after poll : "+deque.pollLast());
        System.out.println("ArrayDeque Element : "+deque);
    }
}
