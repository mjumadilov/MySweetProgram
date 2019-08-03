package repl;

import java.util.Scanner;

public class R41Apartment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Welcome to Cybertek Apartments!");
	    System.out.println("Number of bedrooms you are interested:");
	    int numberOfBedrooms = scan.nextInt();
	    int startingPrice=0;
	    //WRITE YOUR CODE HERE
	    if(numberOfBedrooms == 1) {
	    	System.out.println("One Bedroom Selected");
	    	startingPrice = startingPrice + 1100;
	    	
	    }if (numberOfBedrooms == 2) {
	    	System.out.println("Two Bedroom selected");
	    	startingPrice = startingPrice + 1850;
	    	
	    }if (numberOfBedrooms == 3) {
	    	System.out.println("Three Bedroom selected");
	    	startingPrice = startingPrice + 2550;
	    	
	    }if (numberOfBedrooms >= 4 || numberOfBedrooms < 0 ) {
	    	System.out.println("No such Bedrooms available");
	    	//System.out.println("No such Bedrooms available");
	    }
	    System.out.println("Starting Price: " + startingPrice);
	    
	    
	  }
	}