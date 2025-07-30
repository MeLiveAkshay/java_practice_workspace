package mutli__thread;

public class SharedResource {
    private int number;

    public int getNumber() {
        System.out.println("Got : "+number);
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        System.out.println("Set : "+number);
    }

    
}
