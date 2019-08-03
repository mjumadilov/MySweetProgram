package repl;

import java.util.Scanner;

public class Drink31 {

	public static void main(String[] args) {
	
		
		Scanner dose = new Scanner(System.in);
		int drinks = 0, milligramm, number, overdose;
		System.out.println("Enter number of milligrams in drink: ");
		
		number = dose.nextInt();
		drinks = 10000/number;
		System.out.println("It would take about " + drinks +" drinks "+" for a lethal overdose.");
		
		
		
	}

}
