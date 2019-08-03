package repl;

import java.util.Scanner;

public class R93GetSandwich {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		String nan = "bread";
		
		int beginIndex = str.indexOf(nan) + nan.length();
		int endIndex = str.indexOf(beginIndex);
		
	}

}
