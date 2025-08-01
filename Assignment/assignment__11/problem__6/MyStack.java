import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    private List<T> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    // Push element onto stack
    public void push(T item) {
        stack.add(item);
        System.out.println("Pushed: " + item);
    }

    // Pop element from stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return null;
        }
        T item = stack.remove(stack.size() - 1);
        System.out.println("Popped: " + item);
        return item;
    }

    // Peek top element
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Display the entire stack
    public void printStack() {
        System.out.println("Current Stack: " + stack);
    }
}
