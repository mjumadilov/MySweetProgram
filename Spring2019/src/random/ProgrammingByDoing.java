package random;

import java.util.Scanner;

public class ProgrammingByDoing {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int pin = 12345;
		
		System.out.println("Welcome to the bank of Marat");
		System.out.println("Enter you PIN");
		
		int entry = scan.nextInt();
		
		while (entry != pin) {
			System.out.println("\nIncorrect pin. Try again.");
			System.out.println("Enter your PIN");
			entry = scan.nextInt();
		}
		System.out.println("\nPIN Accepted. You may have an access to your account");
	}

}
