package repl;

import java.util.Scanner;


public class R72EmailTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email=scan.next();
		
		int line =email.indexOf("_");
		int atEmail=email.indexOf("@"); 
		int dot=email.indexOf(".");
			
		String firstName=email.substring(0, line);
		String lastName=email.substring(line+1, atEmail);
		String domain = email.substring(atEmail+1, dot); 
		String com = email.substring(dot+1, email.length());
		

		firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
		
		lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);		

		System.out.println("First name: "+firstName);
		System.out.println("Last name: "+lastName);
		System.out.println("Domain: "+domain);
		System.out.println("Top-Level Domain: "+ com);
		
		
	}

	
	}