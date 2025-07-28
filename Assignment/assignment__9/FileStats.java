package assignment.assignment__9;

import java.io.*;

public class FileStats {
    public static void main(String[] args) {
        // Check if file name is provided as argument
        if (args.length != 1) {
            System.out.println("Usage: java FileStats <filename>");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        // Check if file exists
        if (!file.exists()) {
            System.out.println("File does not exist: " + fileName);
            return;
        }

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length(); // characters (excluding newline)
                String[] words = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("File: " + fileName);
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding newlines): " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
