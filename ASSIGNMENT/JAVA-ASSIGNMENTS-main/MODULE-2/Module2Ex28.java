package core_Java;

import java.util.Scanner;

class Complex
{
	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Complex add(Complex other)
	{
		return new Complex(this.real + other.real, this.imaginary + other.imaginary);
	}
	
	public Complex subtract(Complex other)
	{
		return new Complex(this.real - other.real, this.imaginary - other.imaginary);
	}
	
	 public Complex multiply(Complex other)
	 {
	    double resultReal = this.real * other.real - this.imaginary * other.imaginary;
	    double resultImaginary = this.real * other.imaginary + this.imaginary * other.real;
	    return new Complex(resultReal, resultImaginary);
	 }

	public void display()
	{
		System.out.println("Result: " + this.real + " + " + this.imaginary + "i");
	}
}
public class Module2Ex28 {
	public static void main(String[] args) {
		System.out.println("Enter the real and imaginary parts of the first complex number:");
		double real1;
		Scanner sc = new Scanner(System.in);
		try {
			real1 = sc.nextDouble();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double imaginary1;
		try {
			imaginary1 = sc.nextDouble();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Complex complex1 = new Complex(real1, imaginary1);
	}

}
