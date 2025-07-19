package mockinterview.mockinterview__7;

import java.util.Scanner;

public class MobileNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the Mobile Number: ");
            String mobileNumber = scanner.nextLine();

            if (mobileNumber.length() < 10) {
                throw new DigitNumberException(" It is too short.");
            }

            if (mobileNumber.length() > 10) {
                throw new DigitNumberException(" It is too long.");
            }

            System.out.println("Mobile number is valid: " + mobileNumber);
        } catch (DigitNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
    }
}
