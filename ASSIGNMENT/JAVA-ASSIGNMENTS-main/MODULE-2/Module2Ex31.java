package core_Java;

abstract class Marks
{
	abstract double getPercentage();
}

class A1 extends Marks
{  private double sub1;
   private double sub2;
   private double sub3;
    
   public A1(double sub1, double sub2, double sub3)
   {
	   this.sub1 = sub1;
	   this.sub2 = sub2;
	   this.sub3 = sub3;
   }

	@Override
	double getPercentage() {
		
		return (sub1 + sub2 + sub3) / 3.0;
	}
	
}

class B1 extends Marks
{
	private double sub1;
	private double sub2;
	private double sub3;
	
	public B1(double  sub1, double sub2, double sub3)
	{
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	@Override
	double getPercentage() {
		
		return (sub1 + sub2 + sub3) / 3.0 ;
	}
}
public class Module2Ex31 {
  public static void main(String[] args) {
	A1 studentA = new A1(80,90,75);
	System.out.println("Percentage for studen A: " + studentA.getPercentage() + "%");
	
	B1 studentB = new B1(90,45,80);
	System.out.println("Percentage for student B: " + studentB.getPercentage() + "%");
}
}
