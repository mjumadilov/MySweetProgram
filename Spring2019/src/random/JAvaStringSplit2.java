package random;

public class JAvaStringSplit2 {

	public static void main(String[] args) {

		String s1 = "welcome to split world";
		System.out.println("returning words: ");
		
		for(String w: s1.split("\\s",4)) { // here it is splitting the sentences to 4 lines
			System.out.println(w);
		}
		
	}

}
