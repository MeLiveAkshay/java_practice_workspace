package assignment.assignmnet__7.problem__3;

class Medicine {
    String name;
    String address;

    public Medicine(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displayLabel() {
        System.out.println("Medicine Company: " + name);
        System.out.println("Address: " + address);
    }
}