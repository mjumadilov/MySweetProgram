package day6;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your mood today : ");
		String mood = input.nextLine();
		System.out.println("Enter your location : ");
		String location = input.next();
		System.out.println("Your location is location : "+ location);
		
		System.out.println("Your mood today is : " + mood);
		//close scanner after usage;
		input.close();
	}

}
