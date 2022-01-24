package string_injava;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int productprice[]= {1200,234,435,756,456};
		int covidcases[]= {32435,454,356,2445,656,4335};
		int score[]= {45,65,75,55,34,64,24,65};
		int max=productprice[0];
		for(int x:productprice)
		{
			if(x>max)
				max=x;
			System.out.print(x+" ");
		}
		System.out.println(" ");
		System.out.println("max of product price: "+ max);
		
		for(int x:covidcases)
		{
			System.out.print(x+" ");
		}
		System.out.println(" ");
		
		for(int x:score)
		{
			System.out.print(x+" ");
		}
		System.out.println(" ");
		
		
		
	}

}
