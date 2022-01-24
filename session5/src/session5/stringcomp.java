package session5;

public class stringcomp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="John";// john here is a constant litral in string pool
		String str2= "John";
		String str3= new String("John");
		String str4= new String("John");
		//== to operator compare the reference  not the value
		if(str1== str2)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("no");
		if(str3== str4)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("no");
		if(str1== str4)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("no");
		
		// here we are comparing the content of the str1,str3 string 
		if(str1.equals(str3))
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
	
	if(str3.compareTo(str4)== 0)
	{
		System.out.println("str3 compare to str4");
	}
	else
		System.out.println("s3 compare to s4");
	 
	if(str3.equalToIgnoreCase(str3)== 0)
	{
		System.out.println("s3 compare to ignore case str4");
	}
	else
		System.out.println("s3 not compare to ignore case str4");
	

}
