package core_Java;
class parent
{
	void printValue()
	{
		System.out.println("This is parent class.");
	}
}
class child extends parent
{
	void printvalue()
	{
		System.out.println("This is child class which inherits the properties of parent class");
	}
}
public class Module2Ex24 {
   public static void main(String[] args) {
	child c1 = new child();
	c1.printValue();
	c1.printvalue();
   }
}
