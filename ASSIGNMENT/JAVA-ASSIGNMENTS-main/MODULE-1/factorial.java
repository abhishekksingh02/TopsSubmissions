package core_Java;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number.");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = 1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of a number is:"+fact);
		sc.close();
		
	}

}
