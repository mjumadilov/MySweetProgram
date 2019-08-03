package day10;

import java.util.Scanner;

public class ReviewAmazon {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); 
	
		System.out.println("Welcome to Amazon");
		System.out.println("Please enter the price");
		double price = scan.nextDouble();
		System.out.println("Are you a prime member?");
		boolean isPrimeMember = scan.nextBoolean();
		
		
		if(price < 35) {
			if(isPrimeMember){
				System.out.println("You got free shipping" +price);
			}
			else if (!isPrimeMember){
			System.out.println("You need to pay 5$ shipping " + price);
			price+=5;
			}else { 
			 System.out.println("You got free shipping "+ price);
		}
	}
	}
}


