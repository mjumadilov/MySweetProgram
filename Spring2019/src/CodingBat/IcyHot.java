package CodingBat;

import java.util.Scanner;

public class IcyHot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean icyHot = true;
		int temp1, temp2;
		
		System.out.println("Enter the temperatures");
		temp1 = scan.nextInt();
		temp2 = scan.nextInt();
		
		if(temp1 < 0 && temp2 >100 || temp1 > 100 && temp2 <0) {
			System.out.println(icyHot);
		}else {
			System.out.println(!icyHot);
		}
		
	}

}
