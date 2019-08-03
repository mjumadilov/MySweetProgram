package day12;

import java.util.Scanner;

public class SwitchHW {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		String season;
		int monthNumber;
		
		System.out.println("Enter the number of the month");
		monthNumber = scan.nextInt();
		switch (monthNumber) {
		case 3:
		case 4:
		case 5:
				season = "spring";
				break;
		case 6:
		case 7:
		case 8:
				season = "summer";
				break;
		case 9:
		case 10:
		case 11:
				season = "fall";
				break;
		case 12:
		case 1:
		case 2:
			season = "winter";
			break;
		
		default:
			season ="Invalid entry";
			
		}
		System.out.println(season);
		
	}

}
