package session5;

public class ImmutableProperty_ofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String quote="be exceptional";
		System.out.println("quote is"+quote);
		quote.toUpperCase();//String is unmutable
		System.out.println("quote now is:"+quote);
		String uppercaseQuote = quote.toUpperCase();
		System.out.println("Uppercase quote now is:"+ uppercaseQuote);
		//here we are updating the reference variable to refer to the new upper case string
		//hence, the old lower case string will go dangling
		//i.e String literal resides in te memory with no references variable referring to it
		//quote=quote.toUppercase(); -> not a good practice as per above explanation
		

		
	}

}
