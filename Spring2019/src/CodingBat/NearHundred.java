package CodingBat;

import java.util.Scanner;


public class NearHundred {

	public static void main(String[] args) {

		int n = 0;
		
		boolean nearHundred = true;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		n = scan.nextInt();
		
		if((Math.abs(100 - n)<= 10) || (Math.abs(200 - n) <= 10)) {
			System.out.println(nearHundred);
		}else {
			System.out.println(!nearHundred);
		}
		
	}

}
