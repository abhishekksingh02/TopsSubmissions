package core_Java;

import java.util.Scanner;

public class Module2Ex37 {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Two numbers to divide: ");
	  
	  try {
		System.out.println("Numerator: ");
		int numerator = sc.nextInt();
		
		System.out.println("Denominator: ");
		int denominator = sc.nextInt();
		
		double result = numerator / denominator ;
		
		System.out.println("Result of Division: " + result);
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Error: Division by zero is not possible.");
	}
	  catch(Exception e)
	  {
		  System.out.println("An error occurred while displaying answer: " + e.getMessage());
	  }
	  finally
	  {
		  sc.close();
	  }
	 // sc.close();
}
}
