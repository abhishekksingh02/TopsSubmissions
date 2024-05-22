package core_Java;

abstract class Bank
{
	abstract void getBalance();
}
class BankA extends Bank
{
	@Override
	void getBalance() 
	{
		System.out.println("100$ has been deposited in Bank-A.");
		
	}
}
class BankB extends Bank
{

	@Override
	void getBalance() 
	{
		System.out.println("150$ has been deposited in Bank-B.");
		
	}
	
}
class BankC extends Bank
{
    @Override
	void getBalance() 
	{
		System.out.println("200$ has been deposited in Bank-C.");
		
	}
}
public class Module2Ex30 {
     public static void main(String[] args) {
		
    	 BankA  bankobj1 = new BankA();
    	 bankobj1.getBalance();
    	 
    	 BankB bankobj2 = new BankB();
    	 bankobj2.getBalance();
    	 
    	 BankC bankobj3 = new BankC();
    	 bankobj3.getBalance();
	}
}
