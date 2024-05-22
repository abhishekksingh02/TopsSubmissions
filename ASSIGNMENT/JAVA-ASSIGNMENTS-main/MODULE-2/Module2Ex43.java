package core_Java;
import java.io.*;
// Custom exception class for age not within range
class AgeWithinRangeException extends Exception{
	AgeNotWithinRangeException(String message)
	{
		super(message);
	}
}
// Custom exception class for invalid name
class NameNotValidException extends Exception{
	NameNotValidException(String message){
		super(message);
	}
}
class Student
{
	private int rollNo;
	private String name;
	private int age;
	private String course;
	
	// Constructor with parameter validation
	Student(int rollNo, String name, int age, String course)
	throws AgeNotWithinRangeException, NameNotValidException{
		if(age < 15 || age > 21) {
			throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
			
		}
		if (!name.matches("[a-zA-Z]+")) {
			throw new NameNotValidException("Name should contain only letters.");
		}
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
}
public class Module2Ex43 {
	public static void main(String[] args) {
		Student validStuddent = new Student(1, "Abhishek Singh", 20, "Mathematics");
		System.out.println("Valid Student Details: ");
		System.out.println("Roll No: " + validStudent.getRollNo());
		 System.out.println("Name: " + validStudent.getName());
         System.out.println("Age: " + validStudent.getAge());
         System.out.println("Course: " + validStudent.getCourse());

         // Creating a student with invalid age
         Student invalidAgeStudent = new Student(2, "JaneDoe", 22, "Electrical Engineering");
     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }
	}
   
}
