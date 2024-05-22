package core_Java;

public class Module2Ex41 {
  public static void main(String[] args) {
	 
	  try {
		int age = 20; 
		// Call the validate method to check if the age is valid for voting
		Validate(age);
		
		// If no exception is thrown, print a welcome message
		System.out.println("Welcome to vote!");
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Error: Age is less than 18. Cannot vote.");
	} catch (Exception e)
	  {
		// Handle any other unexpected exception
		System.out.println("An unexpected error occurred: " + e.getMessage());
	  }
}

public static void Validate(int age) {
	// TODO Auto-generated method stub
	if(age < 18)
	{
		throw new ArithmeticException("Age is less than 18. Cannot vote.");
	}
	// If the age is 18 or older no exception is thrown
  }
}
