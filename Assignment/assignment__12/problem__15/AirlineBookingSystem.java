package assignment.assignment__12.problem__15;

import java.util.*;

class Passenger {
    String name;
    int age;
    String passportNumber;

    Passenger(String name, int age, String passportNumber) {
        this.name = name;
        this.age = age;
        this.passportNumber = passportNumber;
    }

    public String toString() {
        return "[" + name + ", Age: " + age + ", Passport: " + passportNumber + "]";
    }
}

public class AirlineBookingSystem {
    private static final Map<String, List<Passenger>> flightMap = new HashMap<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Airline Ticket Booking Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Search Passengers by Flight Number");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt(); sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> bookTicket();
                case 2 -> cancelTicket();
                case 3 -> searchPassengers();
                case 4 -> {
                    System.out.println("Thank you for using the system!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void bookTicket() {
        System.out.print("Enter Flight Number: ");
        String flight = sc.nextLine();
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Passport Number: ");
        String passport = sc.nextLine();

        Passenger p = new Passenger(name, age, passport);
        flightMap.computeIfAbsent(flight, k -> new ArrayList<>()).add(p);
        System.out.println("Booking successful for " + name);
    }

    private static void cancelTicket() {
        System.out.print("Enter Flight Number: ");
        String flight = sc.nextLine();
        System.out.print("Enter Passport Number to Cancel: ");
        String passport = sc.nextLine();

        List<Passenger> passengers = flightMap.get(flight);
        if (passengers != null) {
            boolean removed = passengers.removeIf(p -> p.passportNumber.equals(passport));
            if (removed) {
                System.out.println("Ticket cancelled.");
            } else {
                System.out.println("Passenger not found.");
            }
        } else {
            System.out.println("Flight not found.");
        }
    }

    private static void searchPassengers() {
        System.out.print("Enter Flight Number: ");
        String flight = sc.nextLine();
        List<Passenger> passengers = flightMap.get(flight);
        if (passengers != null && !passengers.isEmpty()) {
            System.out.println("Passengers for flight " + flight + ":");
            passengers.forEach(System.out::println);
        } else {
            System.out.println("No passengers found or flight does not exist.");
        }
    }
}

