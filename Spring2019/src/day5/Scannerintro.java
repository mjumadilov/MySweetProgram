package day5;
import java.util.Scanner;


public class Scannerintro {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		
		String firstName = input.nextLine();
		System.out.println("Last name, " + firstName);
		
		String lastName = input.next();
		System.out.println("Nice to meet you, " + lastName);
		

		

		
	}

}
