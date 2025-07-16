package exception;

public class ThrowDemo {
    public static void main(String[] args) {

        // Manually checking for division by zero to use 'throw'
        int denominator = 0;

        if (denominator == 0) {
            throw new ArithmeticException("Divide not possible from zero");
        }

        int divide = 10 / denominator;
        System.out.println("Result: " + divide);
    }
}
