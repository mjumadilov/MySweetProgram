package replNew;

import java.util.Arrays;
import java.util.Scanner;

public class R127Arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String shortWord = "";
		
		String[] words = str.split(", ");
 		
		int shortest = words[0].length();
		
		for (int i = 0; i < words.length; i++) {
			if(shortest > words[i].length())
				shortest = words[i].length();
		}
		
		for (int j = 0; j < words.length; j++) {
			if(words[j].length() == shortest)
				shortWord = shortWord + " " + words[j];
			
		}
 		
		shortWord = shortWord.substring(1);
		
		String[] newWords = shortWord.split(" ");
		
		Arrays.sort(newWords);
		System.out.println(Arrays.toString(newWords));
		
}
}