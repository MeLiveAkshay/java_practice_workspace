package assignment.assignment__9;

import java.io.*;
import java.util.Scanner;

public class FileIOExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "io.txt";
        File file = new File(fileName);

        try {
            // Step 1: Accept input from user
            System.out.print("Enter a string to write into the file: ");
            String userInput = scanner.nextLine();

            // Step 2: Write the input to io.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(userInput);
            writer.close();
            System.out.println("Data written to " + fileName);

            // Step 3: Show size of the file
            long fileSize = file.length();
            System.out.println("File size: " + fileSize + " bytes");

            // Step 4: Read contents from the file
            System.out.println("Contents of the file:");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Step 5: Delete the file
            if (file.delete()) {
                System.out.println(fileName + " deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
