package core_Java;

public class Module2Ex38 {
  public static void main(String[] args) {
	
	  try {
		int[] a = new int[5];
		a[5] = 30/0;
	} catch (ArithmeticException e)
	  {
		System.out.println("Caught ArithmeticException: Cannot divide by zero.");
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Caught ArrayIndexBoundsException: Array index is out of bounds. ");
	} catch (Exception e) {
		System.out.println("Caught an unexpected exception: " + e.getMessage());
	}
  }
}
