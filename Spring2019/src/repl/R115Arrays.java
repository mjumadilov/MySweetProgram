package repl;

import java.util.*;

public class R115Arrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {
			
			words[i] = input.nextLine();	
		}
		int max = words[0].length();
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			if(words[i].length() > max) {
				max = words[i].length();
				index = i;
			}
		}
		
		System.out.println(words[index]);
	}

}
