package assignment.assignmnet__7.problem__5;
public class TestCar {
    public static void main(String[] args) {
        SportCar sc = new SportCar();

        // Set values using drive() and setter
        sc.drive(220, 6);
        sc.setAirBallonType("Helium Turbo Boost");

        // Display all attributes
        System.out.println("\n--- Sport Car Details ---");
        sc.display();
    }
}