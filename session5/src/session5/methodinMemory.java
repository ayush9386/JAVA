package session5;

public class methodinMemory {
	static int incrementnumber(int number)
	{
		return ++number;
	}
	
	static void squareofnum(int num)
	{
		num= incrementnumber(num);
		System.out.println("squareofnum started");
		System.out.println("num before is:"+num);
		num=num*num;
		System.out.println("num after  is:"+num);
		
		
	}

	public static void main(String[] args) {
		System.out.println("main started");
		int data = 11;
		System.out.println("data before is:"+data);
		squareofnum(data);
	}

}
