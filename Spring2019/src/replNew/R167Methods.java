package replNew;

import repl.If29;

public class R167Methods {

	public static void main(String[] args) {

		System.out.println(coverString("hello hello hello", "ello"));

	}

	public static String coverString(String main, String coverME) {
		    
		 String str= "["+ coverME +"]";
		 String word="";
		 if(main.indexOf(coverME)>0)
			 word= main.replaceAll(coverME, str);
		 else 
			word= "["+main+"]";
			return word;
		
}

}