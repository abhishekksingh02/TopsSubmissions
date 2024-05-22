package core_Java;

import java.util.Scanner;

class login{
	int ac_number = 567849308;
	int ac_pass = 4056;
	int ac,pw;

	
	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your account holder name:");
		String name = sc.next();
		
		System.out.println("Enter your account number: ");
		ac = sc.nextInt();
		
		System.out.println("Enter password: ");
	    pw = sc.nextInt();
	}
	public void verify() 
	{
		if(ac==ac_number) 
		{
			
			if(pw==ac_pass)
			{
				System.out.println("Logged in successfully! ");
				
			   Transaction t1 = new Transaction();
			   t1.deposit();
			   t1.withdraw();
				
				
			}
			else if(ac==ac_number && pw!=ac_pass)
			{
				for(int i=1;i<=3;i++)
				{
					System.out.println("Please enter your password again.");
					
				}
			}
			else
			{
				System.out.println("Your Password is incorrect");
			}
			
		}
		else
		{
			System.out.println("Your Account Number is wrong");
		}
		
	}
}
class Transaction{
	 
	int TotalBalance = 50000;
	 int total;
	void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount you want to deposit: ");
		int dep_amt = sc.nextInt();
	    total = TotalBalance + dep_amt;
		System.out.println("Updated balance is "+ total);
	}
	void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount you want to withdraw: ");
		int with_amt = sc.nextInt();
		  if(total>with_amt) {
			  total = total - with_amt;
			  System.out.println("After withdraw balance is "+ total);
		  }
		  else
		  {
			  System.out.println("Not enough balance.");
		  }
		//int total = TotalBalance - with_amt;
		//System.out.println("Updated balance is "+total);
	}
}
public class BankingApplication {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("----------WELCOME TO THE JAVA BACKED BANKING SYSTEM----------");
	    
	    login l1 = new login();
	    l1.acceptInput();
	    l1.verify();
	    
	  
	}
    
}
