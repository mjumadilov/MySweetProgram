package repl;

import java.util.Scanner;

public class StringNoEnd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		String txt = s.next();
		
		txt = txt.substring(0, txt.length()-1);
		
		System.out.println(txt);
		//System.out.print(txt.charAt(txt.length()-3));
		//System.out.print(txt.charAt(txt.length()-2));
		
		
	}

}
