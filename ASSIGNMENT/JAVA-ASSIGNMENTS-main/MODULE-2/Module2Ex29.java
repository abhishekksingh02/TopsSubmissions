package core_Java;

abstract class Parent123
{
	 // Abstract method message
	abstract void message();
	
}

// First subclass of "Parent"
class FirstSubclass extends Parent123
{
	void message()
	{
		System.out.println("This is first subclass.");
	}
}
// Second subclass of "Parent"
class SecondSubclass extends Parent123
{
	void message()
	{
		System.out.println("This is second subclass.");
	}
}
	

public class Module2Ex29 {
    public static void main(String[] args) {
		FirstSubclass firstobj =  new FirstSubclass();
		
		firstobj.message();
		
		SecondSubclass secondobj = new SecondSubclass();
		
		secondobj.message();
	}
}
