package encapsulation;

public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;

	public void setAccountInfo(String email, String firstName, String password) {
		this.email = email;
		this.firstName = firstName;
		setPassword(password);// method calling another method
	}
	
	public String getAccountInfo() {
		//String ret = email + " | "+ firstName + " | "+ password;
		//return ret;
		//return email + " | "+ firstName + " | "+ password;
		return getEmail() + " | " + getFirstName()+ "| "+ getPassword();
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Password Must be 6 characters");
			return;
		}

		this.password = password;
	}

	// this. (with dot)-> is used to access instance variables from within the
	// class.
	// this() (with parenthesis)--> is used to call another constructor from a
	// constructor
}
