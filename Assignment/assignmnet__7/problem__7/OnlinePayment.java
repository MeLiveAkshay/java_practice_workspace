package assignment.assignmnet__7.problem__7;

public abstract class OnlinePayment {
	private int generateTransactionId;
	public abstract void authenticate();
	int generateTransactionId() {
		return generateTransactionId;
	}
}
