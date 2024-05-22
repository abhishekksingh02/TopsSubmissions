package core_Java;
abstract class Shape12
{   // Abstract method to calculate the area of a rectangle
	abstract double RectangleArea(double length, double breadth);
	
	// Abstract method to calculate the area of Square
	abstract double SquareArea(double side);
	
	// Abstract method to calculate the area of Circle
	abstract double CircleArea(double radius);
}

class Area extends Shape12
{

	@Override
	double RectangleArea(double length, double breadth) {
		// TODO Auto-generated method stub
		return length * breadth;
	}

	@Override
	double SquareArea(double side) {
		// TODO Auto-generated method stub
		return side * side;
	}

	@Override
	double CircleArea(double radius) {
		// TODO Auto-generated method stub
		return 3.14f * radius * radius;
	}
	
}
public class Module2Ex33 {
      public static void main(String[] args) {
		
    	  // Calculate and print the area of a rectangle
    	  Area areaObj = new Area();
    	  double rectangleArea= areaObj.RectangleArea(5 ,8);
    	  System.out.println("Area of Rectangle is: " + rectangleArea);
    	  
    	  // Calculate and print the area of a Square
    	  double squareArea = areaObj.SquareArea(4);
    	  System.out.println("Area of Square is: " + squareArea);
    	  
    	  // Calculate and print the area of circle
    	  double circleArea = areaObj.SquareArea(3);
    	  System.out.println("Area of Circle is: " + circleArea);
    
	}
}
