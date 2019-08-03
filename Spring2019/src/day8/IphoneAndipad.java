package day8;

import java.util.Scanner;

	public class IphoneAndipad{
	public static void main(String[] args) {
	
		

	Scanner scan = new Scanner(System.in);
	double iPhonePrice = 599.99, iPad = 899.99, yourBudget;
	
	System.out.println("Enter iphone count: ");
	int phoneCount = scan.nextInt();
	
	int score =scan.nextInt();
	
	//int score = 59;
	System.out.println("current score is " +score);
	
	if(score > 60) {
		System.out.println("You shall pass !");
	}else {
		System.out.println("You shall not pass !");
	}
	}
	}