package core_Java;

import java.util.Scanner;

public class positivenegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number.");
		int num = sc.nextInt();
		if(num<0)
		{
			System.out.println("Entered number is Negative number.");
		}
		else if(num==0)
		{
			System.out.println("Entered number is zero.");
		}
		else
		{
			System.out.println("Entered number is Positive number.");
		}
	     sc.close();
	}

}
