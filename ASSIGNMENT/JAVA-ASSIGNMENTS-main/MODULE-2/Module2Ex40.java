package core_Java;

public class Module2Ex40 {
    public static void main(String[] args) {
		
    	try {
			if( args.length != 2)
			{
				throw new IllegalArgumentException("Please provide two numbers as command line arguement.");
			}
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			int result = num1 / num2 ;
			
			System.out.println("Result of division: " + result);
		} catch (NumberFormatException e) {
			System.out.println("Please provide valid integers as command line arguemement. ");
			// TODO: handle exception
		} catch (ArithmeticException e)
    	{
			System.out.println("Error: Division by zero is not allowed. ");
    	} catch (IllegalArgumentException e)
    	{
    		System.out.println(e.getMessage());
    	} catch (Exception e)
    	{
    		System.out.println("An unexpected error occurred: " + e.getMessage());
    	}
    	
	}
}
