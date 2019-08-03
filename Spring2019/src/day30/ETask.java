package day30;

public class ETask {

	public static void main(String[] args) {
		reportName("Marat", "Jumadilov");

	
	}

	public static void reportName(String name, String lastName){
	
		String fullName = name + lastName;
		
		System.out.println("The length of first name is "+ name.length());
		System.out.println("The length of last name is "+ lastName.length());
		System.out.println("The first initial of name is "+ name.charAt(0));
		System.out.println("The first initial of lastname is "+ lastName.charAt(0));
		System.out.println("The first initial is "+ name.charAt(0)+lastName.charAt(0));

	}
	
	
}
