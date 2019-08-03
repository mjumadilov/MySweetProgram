package encapsulation;

public class EtsyRegistrationPage {

	public static void main(String[] args) {

		EtsyAccount account1 = new EtsyAccount();
		account1.setEmail("myemail@mail.com");
		account1.setFirstName("Adam");
		account1.setPassword("adem123");

		EtsyAccount account2 = new EtsyAccount();
		account2.setEmail("accoutn@mail.com");
		account2.setFirstName("Joshua");
		account2.setPassword("josh432");

		EtsyAccount account3 = new EtsyAccount();
		account3.setEmail("accoutn@etsy.com");
		account3.setFirstName("_");
		account3.setPassword("123");

		System.out.println("First name of account1 : "+ account1.getFirstName());
		System.out.println("email of account1 : "+ account1.getEmail());
		System.out.println("the password of account 1 : " + account1.getPassword());
	
	
	EtsyAccount myAccount = new EtsyAccount();
	myAccount.setAccountInfo("myemail@email.com", "Bill", "abc123");
	
	System.out.println(myAccount.getEmail() + " | "+ myAccount.getFirstName() + " | "+ myAccount.getPassword());
	
	myAccount.setEmail(myAccount.getEmail().replace("email", "gmail"));
	System.out.println(myAccount.getEmail());

	System.out.println(myAccount.getAccountInfo());
	
	EtsyAccount yourAccount  = new EtsyAccount();
	yourAccount.setAccountInfo("yourEmail123@gmail.com", "Apple", "macbook34");
	String accountInfo = yourAccount.getAccountInfo();
	
	System.out.println(accountInfo);
	
	}

}
