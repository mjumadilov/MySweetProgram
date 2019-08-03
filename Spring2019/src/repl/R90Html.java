package repl;

import java.util.Scanner;

public class R90Html {

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();
		int a = 0;
		int b = 0;
		int c = 0;
		
		String word = "";
		
		if(html.contains("html")) {
			a = html.indexOf("id");
			b = html.indexOf("\"", a + 1);
			c = html.indexOf("\"", b + 1);
			
			word = html.substring(b + 1, c);
			
			System.out.println(word);
		}
		else 
			System.out.println("Invalid input!");
	}

}
