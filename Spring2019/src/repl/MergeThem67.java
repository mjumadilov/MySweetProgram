package repl;

import java.util.Scanner;

public class MergeThem67 {

	public static void main(String[] args) {
		
Scanner scan= new Scanner(System.in);
String word = scan.next();
String word1 = scan.next();

if(word.length()==3 && (word1.length()==3)) {
	System.out.println(word.charAt(0)+""+word1.charAt(0)
	+""+word.charAt(1)+""+word1.charAt(1)+""
	+word.charAt(2)+""+word1.charAt(2));
}else {System.out.println("cannot merge");
}	
		
		
		
		
	}

}
