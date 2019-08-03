package CodingBat;

import java.util.Scanner;

public class LoneTeen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0; int b = 0;
		
		//boolean aTeen = (a >= 13 && a <=19);
		//boolean bTeen = (b >= 13 && b <=19);
		
		System.out.println("Enter two int");
		a  = scan.nextInt();
		b = scan.nextInt();
		
		if((a >= 13 && a <=19) || (b >= 13 && b <=19)){
			System.out.println("Teen");
		}else {
			System.out.println("Not Teen");
		}
		
		
		
	}

}
