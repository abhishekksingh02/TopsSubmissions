package core_Java;

import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of breadth.");
		int b = sc.nextInt();
		System.out.println("Enter the value of height.");
		int h = sc.nextInt();
		
		int area =(b*h)/2;
		
		System.out.println("Area of triangle is: " + area);
		sc.close();
	}
}
