package day30;

public class ETaskAkbar {

	public static void main(String[] args) {
		
		reportName("Marat", "Jumadilov");
					  
			}
	public static void reportName(String firstName,String lastName) {
		  
		  System.out.println("firstName " +firstName + " length is: " 
		      + firstName.length() );
		  
		  System.out.println("lastName " +lastName + " length is: " 
		      + lastName.length() );
		  
		  System.out.println("Your intial is " + firstName.charAt(0) +
		      " "+ lastName.charAt(0));

	}

}
