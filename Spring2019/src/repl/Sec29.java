package repl;

import java.util.Scanner;

public class Sec29 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int inputSeconds, hours, minutes, seconds;
		System.out.println("Enter seconds");
		inputSeconds = scanner.nextInt();
		seconds = inputSeconds %60%60;
		minutes = inputSeconds /60%60;
		hours = inputSeconds / 3600;
		
		System.out.println(hours + " hours"+", "
				+ ""+ minutes + " minutes"+ ", "+ "and "+
		seconds + " seconds");
	}

}
