package core_Java;

import java.util.Scanner;

public class advancecalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("----------MENU DRIVEN CALCULATOR----------");
		 //char operator;
		 int result;
		 System.out.println("Enter first number.");
		 int num1 = sc.nextInt();
		 
		 
		 System.out.println("Enter second number.");
		 int num2 = sc.nextInt();
		 
		 System.out.println("\n Enter 1 for Addition. \n Enter 2 for Subtraction. \n Enter 3 for Multiplication. \n Enter 4 for Division. \n");
		 
		 System.out.println("Enter your choice from Above menu.");
		 int choice = sc.nextInt();
		 
		// System.out.println("\n Enter 1 for Addition. \n Enter 2 for Subtraction. \n Enter 3 for Multiplication. \n Enter 4 for Division. \n");
		 
		if(choice == 1)
		{
			result = num1 + num2;
			System.out.println("Addition is: "+result);
		}
		else if(choice == 2)
		{
			result = num1 - num2;
			System.out.println("Subtraction is: "+result);
		}
		else if(choice == 3)
		{
			result = num1 * num2;
			System.out.println("Multiplication is: "+ result);
		}
		else if(choice == 4)
		{   
			 result = num1 / num2;
		     System.out.println("Division is: "+result);
		
		}
		else
		{
			System.out.println("Please enter a valid choice.....!");
		}
		sc.close();
	}

}
