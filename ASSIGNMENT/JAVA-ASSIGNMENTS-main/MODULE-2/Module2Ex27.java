package core_Java;
 
class Triangle123
{
	private double side1;
	private double side2;
	private double side3;
	  
	   public Triangle123()
	   {
		   this.side1 = 3.0;
		   this.side2 = 4.0;
		   this.side3 = 5.0;
	   }
	   
	   public double calculateArea()
	   {
		   return 0.5 * (side1 * side2);
	   }
	   
	   public double calculatePerimeter()
	   {
		   return side1 + side2 + side3;
	   }
}
public class Module2Ex27 {
	public static void main(String[] args) {
		
		Triangle123 triangle =  new Triangle123();
		System.out.println("Area of the triangle is: " + triangle.calculateArea());
		System.out.println("Perimeter of the triangle is: " + triangle.calculatePerimeter());
	}

}
