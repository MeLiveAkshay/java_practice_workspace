package exception;

public class ThrowsDemo {
    public static void main(String[] args) throws ArithmeticException {
        divide(10, 0); // Will trigger an exception but not crash
        System.out.println("End the Application");
    }

    private static void divide(int i, int j) {
        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            // e.printStackTrace(); // Optional: show full stack trace
        }
    }
}
