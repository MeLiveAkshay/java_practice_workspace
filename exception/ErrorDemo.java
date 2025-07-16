package exception;

public class ErrorDemo {
    public static void main(String[] args) {
        call(); // Start the recursive method call
        System.out.println("End of the Application "); // This line is never reached
    }

    private static void call() {
        try {
            call(); // Recursive call with no exit condition → leads to StackOverflowError
        } catch (Exception exception) {
            // This block will NOT catch StackOverflowError because it's an Error, not an Exception
            exception.printStackTrace();
        }
    }

    /**
     * Note: This program is never terminal
     *
     * Explanation:
     * - The method `call()` calls itself recursively without any base case, 
     *   which causes infinite recursion.
     * - Eventually, the Java Virtual Machine throws a `StackOverflowError`.
     * - Since `Error` is not a subclass of `Exception`, the `catch(Exception e)` block does not catch it.
     * - Therefore, the program crashes with an uncaught `StackOverflowError`, 
     *   and the line "End of the Application" is never printed.
     */
}
