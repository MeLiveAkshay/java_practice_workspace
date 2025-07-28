package assignment.assignmnet__8.problem__4;
import java.util.Scanner;

public class BankMain
{
	 public static void main(String[] args) 
	 {
	        Scanner scanner = new Scanner(System.in);
	        int choice = 0;
	        BankAccount bankAccount = null;
	        int accountNumber = 0; 
	        // ✅ Initialized here
	        String accountNumberString;
	        float withdrawAmount,depositAmount;
	        String accountType = null ;
	        
	        try {
	        			while(true)
	        		{
	        			System.out.println("\n--- Bank Menu ---");
	                    System.out.println("1. Open An Account (saving/current)");
	                    System.out.println("2. Check Balance");
	                    System.out.println("3. Withdraw");
	                    System.out.println("4. Deposit");
	                    System.out.println("5. Exit");
	                    System.out.print("Enter your choice: ");

	                    choice = scanner.nextInt();
	                    
	                    switch(choice) 
	                    
	                    {
	                    case 1:
	                        System.out.print("Enter Account Number(5 digit Only): ");
	                        try {
	                        	accountNumberString=scanner.next();
	                            accountNumber = Integer.parseInt(accountNumberString);
	                        } catch(Exception e) {
	                            e.printStackTrace();
	                        }

	                        System.out.print("Enter Customer Name: ");
	                        String customerName = scanner.next();

	                        System.out.print("Enter Account Type (saving/current): ");
	                        accountType = scanner.next();

	                        System.out.print("Enter Initial Deposit Amount: ");
	                        float amount = scanner.nextFloat();

	                        bankAccount = new BankAccount(accountNumber, customerName, accountType, amount);
	                        System.out.println("your"+  accountType+"Account opened successfully!");
	                        bankAccount.printDetails();
	                        break;

	                    case 2:
	                    		if(accountNumber==0)
	                    		{
	                    			System.err.println("No account found. Please open an account first.");
	                    		}
	                    		else
	                    		{
	                    			 System.out.println("Available Balance: ₹" + bankAccount.getAmount());
	                    		}
	                    		break;

	                    case 3:
	                    	if(accountNumber==0)
                    		{
                    			System.err.println("No account found. Please open an account first.");
                    		}
	                    	else
	                    	{
	                    		System.out.print ("Enter the withdraw Balance : ");
	                    		withdrawAmount=scanner.nextFloat();
	                    		bankAccount.withdrawAmount(withdrawAmount,accountType);
	                    	}
	                        break;

	                    case 4:
	                       if(accountNumber==0)
	                       {
	                    	   		System.err.println("No account found. Please open an account first.");
	                       }
	                       else
	                       {
	                    	   		System.out.print("Enter amount to deposit: ");
	                    	   		depositAmount=scanner.nextFloat();
	                    	   		bankAccount.depositAmount(depositAmount);
	                    	   		
	                       }
	                        break;

	                    case 5:
	                        System.out.println("Exiting... Thank you!");
	                        System.exit(0);
	                        return;

	                    default:
	                        System.out.println("Invalid choice. Please try again.");
	                    }
	        		}
	        }
	        catch(Exception exception)
	        {
	        		exception.printStackTrace();
	        }
	        		finally
	        {
				if(scanner!=null)
				{
					scanner.close();
				}
			} 
	 }
}

   
