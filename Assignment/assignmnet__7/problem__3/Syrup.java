package assignment.assignmnet__7.problem__3;

class Syrup extends Medicine {
    public Syrup(String name, String address) {
        super(name, address);
    }

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Usage Info: Shake well before use.\n");
    }
}