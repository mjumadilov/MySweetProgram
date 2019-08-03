package random;

import java.util.Locale;

public class JavaStringLowerCase {

	public static void main(String[] args) {
		String s1 = "JAVATPOINT hello There";

		String str1 = s1.toLowerCase(Locale.ENGLISH);
		System.out.println(str1);
		
		String turkish = s1.toLowerCase(Locale.forLanguageTag("tr"));
		
		System.out.println(turkish);
		
	}

}
