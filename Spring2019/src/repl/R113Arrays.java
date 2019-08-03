package repl;
import java.util.*;
public class R113Arrays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String [] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()}; 
		
		String [] all = new String[5];
		
		for (int i = 0; i < words.length; i++) {
			all[i] = "" + words[i].charAt(0)+words[i].charAt(words[i].length()-1);
		}
		
		System.out.println(Arrays.toString(all));
	}

}
