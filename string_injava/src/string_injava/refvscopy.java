package string_injava;

public class refvscopy {

	public static void main(String[] args) {
		int a=34;
		int b=a;// value copy operation
		
		//we got a single array container
		//but 2 reference variable referring to it
		int arr[]= {23,45,65};
		int arr2[]=arr;//reference copy operation 
		b=28;
	}

}
