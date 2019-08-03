package repl;

import java.util.Scanner;

public class R98 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		sentence = sentence.replace(" ", "");
		
		int count = sentence.length();
		int sumOfJava = 0;
		int sumOfPython = 0;
		
		String result = "";
		
		for (int i = 0; count - 6> i; i++) {
			if( sentence.substring(i, i + 4).contains("java")) {
				sumOfJava++;
			}
			if( sentence.substring(i, i + 6).contains("python")) {
				sumOfPython++;

		}
		
		 }
		if(sumOfJava == sumOfPython) {
			result = "true";
		} else {
			result = "false";
		}
		System.out.println(result);
	}
}