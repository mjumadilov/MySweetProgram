package repl;

import java.util.Scanner;

public class R89HasJava {

	public static void main(String[] args) {
		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		if (word.substring(0, 5).contains("java")) {
			System.out.println(!exists);
		} else  {
			System.out.println(exists);
		}
	}//if (!word.equals("java"))
}