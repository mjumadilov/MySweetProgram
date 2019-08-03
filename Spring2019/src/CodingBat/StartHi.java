package CodingBat;

import java.util.Scanner;

public class StartHi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean startHi = true;
		String str = "";
		
		System.out.println("Enter a word");
		str = scan.nextLine();
		String firstTwo = str.substring(0, 2);

		if(firstTwo.equals("hi")) {
			System.out.println(startHi);
		}else {
			System.out.println(!startHi);
		}
		
		
	}

}
