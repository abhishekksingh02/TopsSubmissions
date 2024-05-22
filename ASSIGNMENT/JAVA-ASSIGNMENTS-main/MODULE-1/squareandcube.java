package core_Java;

import java.util.Scanner;

public class squareandcube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number.");
		int a = sc.nextInt();
		int square = a*a;
		System.out.println("Square of the number is: "+ square);
		int cube = a*a*a;
		System.out.println("Cube of the number is: "+ cube);
	}

}
