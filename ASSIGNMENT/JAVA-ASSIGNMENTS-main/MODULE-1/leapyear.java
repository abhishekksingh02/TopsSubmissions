package core_Java;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year.");
		int year = sc.nextInt();
		if(year%4==0)
		{
			System.out.println("Entered year is leap year.");
		}
		else
		{
			System.out.println("Entered year is not a leap year.");
		}
		sc.close();
		
	}

}
