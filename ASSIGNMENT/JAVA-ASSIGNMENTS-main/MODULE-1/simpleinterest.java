package core_Java;

import java.util.Scanner;

public class simpleinterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amt.");
		float a = sc.nextFloat();
		System.out.println("Enter rate of interest.");
		float b = sc.nextFloat();
		System.out.println("Enter time period.");
		float c = sc.nextFloat();
		float si = (a*b*c)/100;
		System.out.println("Simple Interest is: "+si);
	}

}
