package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckException {

    public static void main(String[] args) {
        try {
            @SuppressWarnings("unused")
            FileReader fileReader = new FileReader("unchecked.text"); // Corrected class name
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling the checked exception.");
    }
}
