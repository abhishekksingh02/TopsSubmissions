package core_Java;

class Shape
{
	void printMsg()
	{
		System.out.println("This is Shape Class.");
	}
}
class Rectangle12 extends Shape
{
	void printMsg()
	{
		System.out.println("This is rectangle shape.");
	}
}
class Circle extends Shape
{
	void printMsg()
	{
		System.out.println("This is circular shape.");
	}
}
class Square12 extends Shape
{
	void displaySquare()
	{
		System.out.println("Square is rectangle.");
	}
}
public class Module2Ex35 {
	public static void main(String[] args) {
		
		Square12 square = new Square12();
		
		square.printMsg();
		square.displaySquare();
	}

}
