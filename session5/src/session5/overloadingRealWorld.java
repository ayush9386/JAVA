package session5;
class Authentication{
	static void login(String email,String password)
	{
		System.out.println("login in with Email and password");

	}
	static void login(String phone ,int otp) {
		System.out.println("login in with and password");
	}
	static void  login(String gmailid)
	{
		System.out.println("login with gmail");
	}
}

public class overloadingRealWorld {

	public static void main(String[] args) {
		//Authentication obj1;
		Authentication.login("ayushrajraja2001@gmail.com");
	}

}
