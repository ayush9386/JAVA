package session5;
import java.util.Arrays;
public class method_using_references
{
	static void squareofnum(int[] data)
	{
		System.out.println("squareofnum method Started");
		System.out.println("data is " + data);//hashcode
		System.out.println("data is " + Arrays.toString(data));
		
		for(int i=0;i<data.length;i++)
		{
			data[i]*=data[i];
		}
		System.out.println("data after doing square ");
		System.out.println("data is " + Arrays.toString(data));
		
	}
	public static void main(String [] args)
	{
		System.out.println("Main Started");
		int[] data= {10,20,30,40,50};
		System.out.println("data is " + data);//hashcode
		System.out.println("data is " + Arrays.toString(data));
		squareofnum(data);
		
		
	}
}