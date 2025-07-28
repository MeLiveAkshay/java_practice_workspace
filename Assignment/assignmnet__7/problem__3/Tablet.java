package assignment.assignmnet__7.problem__3;

class Tablet extends Medicine {
    public Tablet(String name, String address) {
        super(name, address);
    }

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Usage Info: Store in a cool dry place.\n");
    }
}
