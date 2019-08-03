package replNew;

public class R168Methods {

	public static void main(String[] args) {

		
		System.out.println(wordCount("foo bar"));
		
	}
	public static int wordCount(String words) {
	    
	if (words == null || words.isEmpty()) {
		return 0;
	}
	
	String [] wor = words.split("\\s+");
	return wor.length;
	}
	  
	}