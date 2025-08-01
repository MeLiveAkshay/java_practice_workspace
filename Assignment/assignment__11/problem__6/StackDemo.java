public class StackDemo {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack(); // [10, 20, 30]

        System.out.println("Peeked: " + stack.peek()); // 30

        stack.pop(); // removes 30
        stack.printStack(); // [10, 20]

        stack.pop(); // removes 20
        stack.pop(); // removes 10
        stack.pop(); // nothing to pop

        System.out.println("Stack Empty: " + stack.isEmpty()); // true
    }
}
