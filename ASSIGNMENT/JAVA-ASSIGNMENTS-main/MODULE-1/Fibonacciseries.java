package core_Java;

import java.util.Scanner;

public class Fibonacciseries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t1=0,t2=1;
		System.out.println("Enter the number of terms.");
		int num = sc.nextInt();
		System.out.println("First " + num + " terms of Fibonacci series is: ");
		
		for(int i = 0; i<=num ; i++) {
			System.out.println(t1 + " ");
			int sum = t1 + t2;
			t1=t2;
			t2=sum;
		}
		sc.close();
	}

}
