package assignment.assignment__6;

public class CarInformation {
    private String company;
    private String model;
    private int year;

    // Constructor
    public CarInformation(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }

    
    public void displayInfo() {
        System.out.println("Car Information {");
        System.out.println("  \"Company\": \"" + company + "\",");
        System.out.println("  \"Model\": \"" + model + "\",");
        System.out.println("  \"Year\": " + year);
        System.out.println("}");
    }
}

class Car {
    public static void main(String[] args) {
        CarInformation carInformation = new CarInformation("Toyota", "Camry", 2013);
        carInformation.displayInfo();
    }
}
