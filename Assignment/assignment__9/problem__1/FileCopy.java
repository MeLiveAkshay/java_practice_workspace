package assignment.assignment__9.problem__1;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage");
            return;
        }

        String sourcePath = args[0];
        String destPath = args[1];

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist: " + sourcePath);
            return;
        }

        if (sourceFile.getAbsolutePath().equals(destFile.getAbsolutePath())) {
            System.out.println("Source and destination files are the same. Aborting.");
            return;
        }

        if (destFile.exists()) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Destination file already exists. Overwrite? (Yes/No): ");
                String response = scanner.nextLine().trim();
                if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("y")) {
                    System.out.println("Copy operation aborted by user.");
                    return;
                }
            }
        }

        try (
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file copying: " + e.getMessage());
            // e.printStackTrace(); // Uncomment during debugging
        }
    }
}
