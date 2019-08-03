package repl;

import java.util.Scanner;

public class R92Json {

	public static void main(String[] args) {

		
		Scanner scan =  new Scanner(System.in);
		int a, b, c;
		
		String json = scan.nextLine();
		json = json.replace("\"", "");
		json = json.replace(":", "");
		json = json.replace(" ", "");
		json = json.replace(",", "");
		
		a = json.indexOf("firstName");
		b = json.indexOf("lastName");
		c = json.indexOf("role");
		
		String firstName = json.substring(a + 9, b);
		String lastName = json.substring(b + 8, c);
		
		System.out.println("First name: " + firstName);
		System.out.println("Last name: "+ lastName);

		
		
	}

}
