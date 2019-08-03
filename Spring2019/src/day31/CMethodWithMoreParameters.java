package day31;

public class CMethodWithMoreParameters {

	public static void main(String[] args) {

		login("Aileen", "1/11", true);
		login("Aileen", "1/11", false);

		
	}
	
	public static void login(String user, String password, boolean rememberme) {
		if(rememberme == true) {
			System.out.println("You checked rememberMe");
		//	System.out.println("You entered password "+ password);

		}else {
			System.out.println("Try again");
		}
	}
}
/*	login("firuz", "fizuli", true);

}

public static void login(String user, String password, boolean rememberme) {

	System.out.println("You entered username: " + user);
	System.out.println("You entered password: " + password);
	if (rememberme == true) {
		System.out.println("You checked rememberme box");
	} else {
		System.out.println("You did not checked rememberme box");
	}
}
*/