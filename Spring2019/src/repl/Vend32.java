package repl;

import java.util.Scanner;

public class Vend32 {

	public static void main(String[] args) {
		
	Scanner vend = new Scanner(System.in); 
		int itemPrice, quarters, dimes, nickles, change; 
		
		System.out.println("Enter price in cents: ");
		itemPrice = vend.nextInt();
		
		change = 100 - itemPrice;
		quarters = change/25;
		dimes = change%25/10;
		nickles = change%25%10/5;
		
		if(itemPrice>=25&& itemPrice<=100 && (itemPrice%5)==0) {
			System.out.println("Your change is "+ quarters + " quarters, "
			+ dimes+ " dimes, and " + nickles + " nickles.");
		}
		
		if(itemPrice%5!=0||itemPrice<25||itemPrice>100) {
			System.out.println("invalid price");
		}
		
		
		
		
		
	}

}
