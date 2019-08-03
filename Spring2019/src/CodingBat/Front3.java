package CodingBat;

import java.util.Scanner;

public class Front3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str ="";
		String front = "";

		System.out.println("Enter a word");
		str = scan.nextLine();
		
		if(str.length() >= 3) {
			front = str.substring(0, 3);
		}else {
			front = str;
		}
				
		System.out.println(front + front + front);
		
		
	}

}
