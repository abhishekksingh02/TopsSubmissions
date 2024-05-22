package core_Java;

import java.util.Scanner;

public class Module2Ex32 {
    static long factorial(int n)
    {
    	if(n == 0|| n ==1)
    	{
    		return 1;
    	}
    	else
    	{
    		return n * factorial(n-1);
    	}
    }
    public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter a number to calculate its factorial: ");
    	int num = sc.nextInt();
    	
    	if(num < 0)
    	{
    		System.out.println("Factorial is not defined for the negative numbers.");
    	}
    	else
    	{
    		long result = factorial(num);
    		System.out.println("Factorial of " + num + " is: " + result);
    	}
    	sc.close();
	}
}
