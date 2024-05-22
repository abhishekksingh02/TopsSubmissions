package core_Java;

import java.util.Scanner;

public class Module2Ex11 {
     
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any integer value:");
		 int n = sc.nextInt();
		 sc.close();
		 int result = n + concatenateDigits(n,2) + concatenateDigits(n,3);
		 
		 System.out.println("Result: " + result);
	}

	private static int concatenateDigits(int base, int count) {
		int result = 0;
		int multiplier = 1;
//		int count;
		
		for(int i= 0; i<count; i++)
		{
			result += multiplier * base;
			multiplier *= 10;
		}
		
		return result;
	}
}
