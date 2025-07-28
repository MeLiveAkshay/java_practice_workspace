package assignment.assignmnet__8.problem__4;

public class BankAccount {
	private int accountNumber;
	private String customerName; 
	private String accountType; //current and saving
	private float amount;
	

	
	public BankAccount(int accountNumber, String customerName,String accountType,float amount ) throws NegativeAmountException, LowBalanceException
	{
		if(amount< 0) {
			throw new NegativeAmountException("Initial balance cannot be negative.");
		}
		if(accountType.equalsIgnoreCase("saving") && (amount<1000)) {
			throw new LowBalanceException("Savings account requires a minimum balance of Rs. 1000. for the Account Openining");	
		}
		if(accountType.equalsIgnoreCase("current") && (amount<5000)) {
			throw new LowBalanceException("current account requires a minimum balance of Rs. 5000. for the Account Openining");	
		}
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.accountType=accountType;
		this.amount=amount;
	}
	
	
	
	
	
	
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}






	public void printDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Customer Name : " + getCustomerName());
        System.out.println("Account Type  : " + getAccountType());
        System.out.println("Balance       : ₹" +getAmount() );
    }

	public void withdrawAmount(float withdrawAmount, String accountType)
	        throws NegativeAmountException, InsufficientFundsException {

	    if (withdrawAmount < 0) {
	        throw new NegativeAmountException("Withdrawal amount cannot be negative.");
	    }

	    if (accountType.equalsIgnoreCase("saving") && (amount - withdrawAmount < 1000)) {
	        throw new InsufficientFundsException("Savings account requires a minimum balance of Rs. 1000.");
	    }

	    if (accountType.equalsIgnoreCase("current") && (amount - withdrawAmount < 5000)) {
	        throw new InsufficientFundsException("Current account requires a minimum balance of Rs. 5000.");
	    }

	    if (withdrawAmount > amount) {
	        throw new InsufficientFundsException("Cannot withdraw more than available balance.");
	    }

	    amount -= withdrawAmount;
	    System.out.println("Successfully withdrawn ₹" + withdrawAmount);
	}
	
	public void depositAmount(float depositAmount) {
		amount +=depositAmount;
		System.out.println("Deposit successfulty.");
		
	}

}
