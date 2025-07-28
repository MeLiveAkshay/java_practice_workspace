package assignment.assignmnet__8.problem__2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("Wireless Mouse", 499.0, 10);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter quantity to purchase: ");
            String input = bufferedReader.readLine(); // read the full line
            int qty = Integer.parseInt(input); // convert to int

            product.purchase(qty);

            System.out.println("Purchase successful!");
        } catch (IllegalArgumentException argumentException) {
            System.out.println("Invalid input: " + argumentException.getMessage());
        } catch (OutOfStockException exception) {
            System.out.println("Stock error: " + exception.getMessage());
        } catch (IOException e) {
            System.out.println("IO error occurred: " + e.getMessage());
        }

        System.out.println("Remaining stock: " + product.getStock());
    }
}
