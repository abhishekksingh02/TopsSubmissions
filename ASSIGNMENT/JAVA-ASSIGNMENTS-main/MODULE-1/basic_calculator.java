package core_Java;

import java.util.Scanner;

public class basic_calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1.");
		int a = sc.nextInt();
		System.out.println("Enter number 2.");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Additon is: "+ sum);
		int mul = a * b;
		System.out.println("Multiplication is: "+ mul);
		int sub = a - b;
		System.out.println("Subtraction is: "+ sub);
		int div = a / b;
		System.out.println("Divison is: "+ div);
		sc.close();
		}

}
