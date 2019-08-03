package repl;

import java.util.Scanner;

public class Candy35 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		int candies, gumball, coupons;
		
		coupons = scan.nextInt();
		candies = coupons / 10;
		gumball = coupons %10 / 3;
		System.out.println("Number of Candies: " + candies);
		System.out.println("Number of Gumball: " + gumball);

	}

}
