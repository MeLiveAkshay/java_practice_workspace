package assignment.assignmnet__7.problem__3;

class Ointment extends Medicine {
    public Ointment(String name, String address) {
        super(name, address);
    }

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Usage Info: For external use only.\n");
    }
}
