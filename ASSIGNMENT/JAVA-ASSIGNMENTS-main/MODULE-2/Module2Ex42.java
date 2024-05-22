package core_Java;
// Custom exception class for iinsufficient balance
class InsufficientBalanceException extends Exception
{
	private int requiredAmount = 0;
	
	public InsufficientBalanceException(int requiredAmount)
	{
		this.requiredAmount = requiredAmount;
	}
	public int getRequiredAmount()
	{
		return requiredAmount;
	}
	
	public String getMessage()
	{
		return "Sorry, insufficient balance. You need more " + requiredAmount + "Rs. to perform this transaction." ;
	}
}
//BankAccount class to handle account operations
class BankAccount {
 private int accountBalance;

 public BankAccount(int initialBalance) {
     this.accountBalance = initialBalance;
 }

 // Method to withdraw amount
 public void withdraw(int amount) throws InsufficientBalanceException {
     if (amount > accountBalance) {
         throw new InsufficientBalanceException(amount - accountBalance);
     } else {
         accountBalance -= amount;
         System.out.println("Amount withdrawn successfully. Remaining balance: " + accountBalance);
     }
  }
}

public class Module2Ex42 {
   public static void main(String[] args) {
	
	   // Assuming initial account balance is 2000
	   BankAccount account = new BankAccount(200);
	   
	   // Let Withdraw amount = 2500
	   try {
		int withdrawAmount = 2500;
		account.withdraw(withdrawAmount);
	} catch (InsufficientBalanceException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	 }
   }
}
