package session5;

public class Overloding {
	
	static void add(int num,int num1)
	{
		int sum=num+num1;
		System.out.println("sum of two numbers:" +sum);
	}
	static void add(int num1,int num2,int num3)
	{
		int sum=num1+num2+num3;
		System.out.println("sum of two numbers:"+sum);
	}
	static void add(double num1,double num2)
	{
		double sum=num1+num2;
		System.out.println("sum of two numbers:"+sum);
	}
	//compile time polymorphism
	// >> overloading
	/* rules to overload:
	 * 1. name should be same
	 * 2.Input must be unique
	 * 		2.1  number if inputs
	 * 		2.2 types of input
	 * 		2.2 sequence of input
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10.45,31.0);
	}

}
