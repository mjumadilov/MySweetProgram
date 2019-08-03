package repl;

import java.util.Scanner;

public class Keremabi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter price in cents");

		int itemPrice, change, quarters, dimes, nickels;

		itemPrice = scan.nextInt();

		change = 100 - itemPrice;

		quarters = (change / 25);

		dimes = (change - (quarters * 25)) / 10;

		nickels = (change - ((quarters * 25) - (dimes * 10))) / 5;

		if (itemPrice % 5 == 0 && itemPrice > 25 && itemPrice < 100)

			System.out.println("Your change is " + quarters + " quarters" + ", " + dimes + " dimes" + ", " + "and "
					+ nickels + " nickels.");

		else if (itemPrice < 25 || itemPrice > 100 || itemPrice % 5 != 0)

			System.out.println("Invalid price!");

	}
}
