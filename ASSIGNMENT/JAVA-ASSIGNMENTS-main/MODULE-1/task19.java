package core_Java;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("-----------WELCOME:)----------");
		
		 System.out.println("\n Enter 1 to find area of Triangle. \n Enter 2 to find area of Rectangle. \n Enter 3 to find arear of Circle. \n");
		 
		 
		 System.out.println("Enter your choice from above menu.");
		 int choice = sc.nextInt();
		 
		 
		  if(choice == 1)
		  {
			  System.out.println("Enter the value of height.");
			  int h = sc.nextInt();
			  System.out.println("Enter the value of base.");
			  int b = sc.nextInt();
			  int area = (b*h)/2;
			  System.out.println("Area of Triangle is: "+area);
		  }
		  
		  
		  else if(choice == 2)
		  {
			  System.out.println("Enter the value of length.");
			  int l = sc.nextInt();
			  System.out.println("Enter the value of width.");
			  int w = sc.nextInt();
			  int area = l*w;
			  System.out.println("Area of rectangle is: "+area);
		  }
		  
		  
		  else if(choice == 3)
		  {
			  System.out.println("Enter the value of Radius.");
			  int r = sc.nextInt();
			  float area = 3.14f * r * r;
			  System.out.println("Area of cirle is: "+area);
		  }
		  
		  
		  else
		  {
			  System.out.println("Please enter a valid choice......!!");
		  }
		  
		  
		  sc.close();
		 
	}
}
