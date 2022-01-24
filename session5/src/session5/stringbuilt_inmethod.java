package session5;

public class stringbuilt_inmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names="John, Jennie, Jim, Jack, Joe";
		int idx=names.indexOf("o");
		System.out.println("index of o:"+idx );
		idx=names.lastIndexOf("o");
		System.out.println("index of o from the end:"+idx );
		int length =names.length();
		System.out.println("length of names is:"+length );
		char ch=names.charAt(2);
		System.out.println("ch is:"+ch );
		ch=names.charAt(length -1);
		System.out.println("ch is:"+ch );
		idx=names.indexOf("Jim");// index of Jim's J
		System.out.println("index of jim is:"+idx );
		String substring=names.substring(idx,17);
		System.out.println("substring is:"+substring);
		String[] strArr=names.split(",");
		for(String str:strArr) {
			System.out.print(str.trim()+" ");
		}
		String email="ayushrajraja2001gmail.com";
		if(email.contains("@") && email.contains("."))
		{
			System.out.println("valid email");
		}
		else
			System.out.println("invallid email");
		String googlemail="john@gmail.com";
		if(googlemail.endsWith("gmail.com"))
		System.out.println("valid gmail account");
		else
			System.out.println("Invalid gmail account");
	}

}
