package core_Java;

import java.util.Scanner;

public class percentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of subejct 1.");
		float sub1 = sc.nextFloat();
		System.out.println("Enter the marks of subject 2.");
		float sub2 = sc.nextFloat();
		System.out.println("Enter the marks of subject 3.");
		float sub3 = sc.nextFloat();
		System.out.println("Enter the marks of subject 4.");
		float sub4 = sc.nextFloat();
		System.out.println("Enter the marks of subject 5.");
		float sub5 = sc.nextFloat();
		float sum = sub1 + sub2 + sub3 + sub4 + sub5;
		System.out.println("Total marks is: "+sum);
		float percentage = sum/5;
		System.out.println("Pecentage: "+ percentage);
		}

}
