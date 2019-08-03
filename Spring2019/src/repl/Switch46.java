package repl;

import java.util.Scanner;

public class Switch46 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char response = 'a';
		
		System.out.println("Enter command");
		response= s.next().charAt(0);
		switch (response) {
		case 'y':
			System.out.println("Your request is being processed is printed");
			break;
		case 'n':
			System.out.println("Thank you anyway for your consideration is printed");
			break;
		case 'h':
			System.out.println("Sorry, no help is currently available is printed");
			break;
		default:
			System.out.println("Invalid entry, please try again!");
		}
		
		
		
		
		
	}


}
