package core_Java;

import java.util.Scanner;

public class Module2Ex34 {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   // Asking the user to enter marks out of 100
	   System.out.println("Enter your marks (out of 100): ");
	   int marks = sc.nextInt();
	   
	   System.out.println("Grade: " + calculateGrade(marks));
       
	   sc.close();
   }
   // Method to calculate and return the grade based on marks
   public static String calculateGrade(int marks)
   {
	   if(marks >= 91 && marks <= 100)
	   {
		   return "A";
	   }
	   else if(marks >= 81 && marks <= 90)
	   {
		   return "B+";
	   }
	   else if(marks >= 71 && marks <= 80)
	   {
		   return "B";
	   }
	   else if(marks >= 61 && marks <= 70)
	   {
		   return "C";
	   }
	   else if(marks >= 51 && marks <= 60)
	   {
		   return "D+";
	   }
	   else if(marks >= 41 && marks <= 50)
	   {
		   return "D";
	   }
	   else
	   {
		   return "Fail";
	   }
   }
}
