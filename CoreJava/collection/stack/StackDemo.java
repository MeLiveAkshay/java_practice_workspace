package collection.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Long> stack=new Stack<>();
        stack.push(100L);
        stack.push(200l);
        stack.push(300l);
        stack.push(400l);
        stack.push(500l);
        stack.push(300l);
        stack.push(400l);
        stack.push(500l);

        System.out.println("-----------Peek Method () -------------------------");
        System.out.println("Top of the Stack : "+stack.peek());//500
        System.out.println("Top of the Stack : "+stack.peek());//500

        System.out.println("-----------Pop Method ()-------------------------");
        System.out.println("Top of the Stack : "+stack.peek());//500
        System.out.println("Top of the Stack : "+stack.pop());//500
        System.out.println("Top of the Stack : "+stack.pop());//400
        System.out.println("Top of the Stack : "+stack.peek());//300


        //System.out.println(stack); 
    }
}
