package day15;

import java.util.Scanner;



public class AmazonSearchTest {

	public static void main(String[] args) {
		

		Scanner scan= new Scanner(System.in);
		
		
		System.out.println(" Search your item...");

		String itemToSearchFor = scan.nextLine();
		
		System.out.println("You have entered: "+ itemToSearchFor);
		
		String expectedResult = "Amazon.com : ipad";
		
		String actualResult = "Amazon.com :"+itemToSearchFor;
		
		if(expectedResult.equalsIgnoreCase(actualResult)) {
			System.out.println("Test pass for ipad");
		}else {
			System.out.println("Test fail for ipad");
		}
		
	}

}
