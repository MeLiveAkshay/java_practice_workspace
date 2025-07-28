package assignment.assignmnet__7.problem__4;

public class CommandLineCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java CommandLineCalculator <num1> <num2> <operator>");
            System.out.println("Example: java CommandLineCalculator 10 5 +");
            return;
        }

        try {
            double firstNumber = Double.parseDouble(args[0]);
            double secondNumber = Double.parseDouble(args[1]);
            String operator = args[2];

            switch (operator) {
                case "+":
                    System.out.println("Result: " + (firstNumber + secondNumber));
                    break;
                case "-":
                    System.out.println("Result: " + (firstNumber - secondNumber));
                    break;
                case "*":
                    System.out.println("Result: " + (firstNumber * secondNumber));
                    break;
                case "/":
                    if (secondNumber == 0) {
                        System.out.println("Error: Division by zero.");
                    } else {
                        System.out.println("Result: " + (firstNumber / secondNumber));
                    }
                    break;
                case "%":
                    if (secondNumber == 0) {
                        System.out.println("Error: Modulus by zero.");
                    } else {
                        System.out.println("Result: " + (firstNumber % secondNumber));
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Use +, -, *, /, or %.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");
        }
    }
}
