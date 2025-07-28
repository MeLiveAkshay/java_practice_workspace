package oops.Interface;

interface Bank {
    float getInterestRate(); // abstract method
    void displayBankName();
}

public class SBI implements Bank {

    // Implementing abstract methods
    public float getInterestRate() {
        return 6.75f;  // SBI interest rate
    }

    public void displayBankName() {
        System.out.println("State Bank of India");
    }

    public static void main(String[] args) {
        SBI bank = new SBI();
        bank.displayBankName();
        System.out.println("Interest Rate: " + bank.getInterestRate() + "%");
    }
}
