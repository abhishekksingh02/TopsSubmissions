package core_Java;

public class Module2Ex21 {
    //Method to print integer
	public void printn(int num)
	{
		System.out.println("Printing integer: " + num);
	}
	//Method to print double
	public void printn(double num)
	{
		System.out.println("Printing double: " + num);
	}
	//Method to print float
	public void printn(float num)
	{
		System.out.println("Printing float: " + num);
	}
	//Method to print long
	public void printn(long num)
	{
		System.out.println("Printing long: " + num);
	}
	//Method to print short
	public void printn(short num)
	{
		System.out.println("Printing short: " + num);
	}
	//Method to print byte
	public void printn(byte num)
	{
		System.out.println("Printing byte: " + num);
	}
	//Method to print char
	public void printn(char ch)
	{
		System.out.println("Printing char: " + ch);
	}
	//Method to print boolean
	public void printn(boolean bool)
	{
		System.out.println("Printing boolean: " + bool);
	}
  public static void main(String[] args) {
	
	 Module2Ex21 printer =  new Module2Ex21();
	 
	 printer.printn(10);
	 printer.printn(10.5);
	 printer.printn(5.5f);
	 printer.printn(10000000L);
	 printer.printn((short) 45);
	 printer.printn((byte) 5);
	 printer.printn('A');
	 printer.printn(true);
   }
}
