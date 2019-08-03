package CodingBat;

import java.util.Scanner;

public class monkeytrouble {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	boolean aSmile = true;
	boolean bSmile = true;
	
	System.out.println("Enter booleans");
	aSmile =scan.hasNext();
	bSmile =scan.hasNext();
	
	
	if(aSmile && bSmile) {
		System.out.println(true);
	}if(!aSmile && !bSmile) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
		
		
		
	}

}
