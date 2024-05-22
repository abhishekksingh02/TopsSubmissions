package core_Java;

import java.util.Scanner;

public class Module2Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter a positive number: ");
		int num =  sc.nextInt();
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("Nnumber of digits in the entered integer are: " + count);
		sc.close();
	}

}
