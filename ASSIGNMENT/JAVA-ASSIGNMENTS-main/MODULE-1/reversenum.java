package core_Java;

import java.util.Scanner;

public class reversenum {
	public static void main(String[] args) {
		int n ,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number.");
		int num = sc.nextInt();
		
		while(num>0) {
			n = num % 10;
			sum = sum * 10 + n;
			num = num / 10;
		}
		System.out.println("Reverse of a number is: "+sum);
     sc.close();		
	}
	
}
