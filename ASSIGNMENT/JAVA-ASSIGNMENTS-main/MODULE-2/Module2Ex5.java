package core_Java;

import java.util.Scanner;

public class Module2Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int nOI=5;
		for(int i = 1 ; i<=nOI ; i++)
		{
			System.out.println("Enter number "+ i + ":");
			int num = sc.nextInt();
			sum+=num;
		}
		int average = sum/nOI;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+average);
		sc.close();
	}

}
