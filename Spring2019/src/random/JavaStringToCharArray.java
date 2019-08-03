package random;

public class JavaStringToCharArray {

	public static void main(String[] args) {

		String s1 = "Aisha and Aileen";
		
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i] + "*");
		}
 		
		
	}

}
