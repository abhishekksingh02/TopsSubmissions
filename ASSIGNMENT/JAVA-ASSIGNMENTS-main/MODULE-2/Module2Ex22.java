package core_Java;

public class Module2Ex22 {
   
	 public void printValue(int num, char ch)
	 {
		 System.out.println("Printing integer first, then character: " + num + " " + ch);
	 }
	 
	 public void PrintValue(char ch, int num)
	 {
		 System.out.println("Printing character first, then integer: " + ch + " " + num);
	 }
	 
	 public static void main(String[] args) {
		Module2Ex22 printer = new Module2Ex22();
		
		printer.PrintValue('F',45);
		printer.printValue(10, 'B');
	}
}
