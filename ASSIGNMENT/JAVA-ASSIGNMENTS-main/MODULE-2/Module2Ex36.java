package core_Java;

import java.util.Scanner;

public class Module2Ex36 {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter Two numbers to divide:");
	   
	   try {
		System.out.println("Numerator: ");
		int numerator = sc.nextInt();
		
		System.out.println("Denominator: ");
		int denomenator = sc.nextInt();
		
		double result = numerator / denomenator;
		
		System.out.println("Result of Division: " + result);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Error: Division by zero is not defined. ");
	}
	   sc.close();
  }
}

