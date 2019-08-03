package day28;

public class AWarmUp {

	public static void main(String[] args) {
		 String str = "Sunday Perfect Day to start coding";
		    String[] words = str.split(" ");  
		    String reversedSentence = "";
		    
		    for (int j = 0; j < words.length; j++) {
		    
		      String one = words[j] ; 
		      char[] wordChars = one.toCharArray();
		      int lastIndex = wordChars.length-1 ; 
		      
		      for (int i = 0; i < wordChars.length/2; i++) {
		        
		         char temp = wordChars[i]; 
		         wordChars[i] =  wordChars[lastIndex-i] ; 
		         wordChars[lastIndex-i] = temp ; 
		      }
		      String reversed = new String(wordChars);
		      
		      reversedSentence = reversedSentence + reversed + " " ; 
		    
		    }
		    
		    System.out.println(reversedSentence);

		    
	}

}
