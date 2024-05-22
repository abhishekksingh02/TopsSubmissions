package core_Java;

import java.util.Scanner;

public class areaofcircle {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Radius of the circle.");
		 float a = sc.nextFloat();
		 float area = 3.14f*a*a;
		 System.out.println("Area of Circle is: "+ area);
		 sc.close();
	}

}
