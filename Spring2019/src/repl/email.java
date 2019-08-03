package repl;

import java.util.Scanner;

public class email {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email=scan.nextLine();
		
		
		if (email.contains("_")) {
	
			int line =email.indexOf("_");
			int atEmail=email.indexOf("@"); 
			int emailA=email.length();
		
		String firstName=email.substring(0, line);
		String lastName=email.substring(line+1, atEmail);
		
		
			System.out.println(lastName+"_"+firstName+email.substring(atEmail, emailA));	
			}
		
		else {
			System.out.println(email);	
			}
	}
	}