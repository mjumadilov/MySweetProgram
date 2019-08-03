package CodingBat;

import java.util.*;

public class ParrotTrouble {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean talking = true;
		int hour;
		System.out.println("Enter an hour");
		talking = scan.hasNext();
		System.out.println("Enter an hour");
		hour =scan.nextInt();
		
		System.out.println(talking &&(hour < 7 || hour >20));
	}

}
