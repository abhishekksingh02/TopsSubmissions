package core_Java;

public class Module2Ex23 {
     public void calcArea(int length, int breadth)
     {
    	 int area = length * breadth;
    	 System.out.println("Area of Reactangle with length 5 and breadth 8 is: " + area);
     }
     
     public void calcArea(int side)
     {
    	 int area =  side * side;
    	 System.out.println("Area of Square with side 4 is: " + area);
     }
     public static void main(String[] args) {
		Module2Ex23 calculate = new Module2Ex23();
		
		calculate.calcArea(5,8);
		calculate.calcArea(4);
	}
}
