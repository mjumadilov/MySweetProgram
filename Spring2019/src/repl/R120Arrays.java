package repl;

import java.util.*;

public class R120Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String sentence = input.nextLine();
		
		String[] app= sentence.split(" ");
		for (int i = app.length - 1; i >= 0; i--) {
			System.out.println(app[i]);
		}
	}

}
