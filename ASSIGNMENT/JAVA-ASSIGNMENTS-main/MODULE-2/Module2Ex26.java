package core_Java;

class Rectangle_1
{
	double length;
	double breadth;
	
	// Constructor
	Rectangle_1(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	// Method to calculate area
	
	double calcArea() 
	{
		return length *  breadth;
	}
	
	// Method to calculate perimeter
	
	double calcPerimeter()
	{
		return 2 * (length + breadth);
	}
}
class Square_1 extends Rectangle_1
{
	Square_1(double side)
	{
		super(side, side);
	}
}
public class Module2Ex26 {
	public static void main(String[] args) {
		
		Rectangle_1 rectangle = new Rectangle_1(5.0, 8.0);
		
		System.out.println("Area of Rectangle is: " + rectangle.calcArea());
	    System.out.println("Perimeter of Rectangle is: " + rectangle.calcPerimeter());
	    
	    Square_1 square = new Square_1(4.0);
	    
	    System.out.println("Area of Square is: " + square.calcArea());
	    System.out.println("Perimeter od Square is: " + square.calcPerimeter());
	    
	}
   
    
}
