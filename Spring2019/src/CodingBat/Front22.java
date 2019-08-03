package CodingBat;

import java.util.Scanner;

public class Front22 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		String front="";
		
		String str="";
		int take = 2;

		
		System.out.println("Enter a word");
		str = scanner.nextLine();
		

		if(take > str.length()) {
			take = str.length();
		
		}else if(front == str.substring(0, take)){
		
			System.out.println(front + str + front);

		}
		

		
	}

}
