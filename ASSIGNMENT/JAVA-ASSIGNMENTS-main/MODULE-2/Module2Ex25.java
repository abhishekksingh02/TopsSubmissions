package core_Java;

class Members
{
   // Data members
	String name;
	int age;
	String phoneNumber;
	String address;
	double Salary;
	   // Parameterized constructor
	   Members(String name, int age, String phoneNumber, String address, double Salary) {
		   
		   this.name = name;
		   this.age = age;
		   this.phoneNumber = phoneNumber;
		   this.address = address;
		   this.Salary = Salary;
	}
	   
	   void printSalary()
	   {
		   System.out.println("Salary of " + name + " is: "+ Salary);
	   }
}
public class Module2Ex25 {
   public static void main(String[] args) {
	   
	Members mem1 = new Members("Abhishek singh" , 22 , "8160509056" , "Kotecha Circle" , 50000);
	mem1.printSalary();
	
	Members mem2 = new Members("Nikhil Roshiya" , 22, "723456789" , "Khodiyar Colony" , 100000);
    mem2.printSalary();
   }
}
