package assignment.assignmnet__7.problem__1;

public class InstrumentTest {
    public static void main(String[] args) {
        // Create an array of Instrument references
        Instrument[] instruments = new Instrument[10];

        // Assign different instruments (randomly or systematically)
        for (int i = 0; i < instruments.length; i++) {
            if (i % 3 == 0) {
                instruments[i] = new Piano();
            } else if (i % 3 == 1) {
                instruments[i] = new Flute();
            } else {
                instruments[i] = new Guitar();
            }
        }

        // Polymorphic behavior
        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();  // Calls the appropriate overridden method
        }

        System.out.println("\n--- Instrument types at each index ---");
        // Use instanceof to print the actual object type at each index
        for (int i = 0; i < instruments.length; i++) {
            System.out.print("Index " + i + ": ");
            if (instruments[i] instanceof Piano) {
                System.out.println("Piano");
            } else if (instruments[i] instanceof Flute) {
                System.out.println("Flute");
            } else if (instruments[i] instanceof Guitar) {
                System.out.println("Guitar");
            }
        }
    }
}