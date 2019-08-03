package replNew;

import java.util.Arrays;

public class R194 {

	public static boolean isAnagram(String word1, String word2) {
		  word1=word1.toLowerCase();
		word2=word2.toLowerCase();
		word1=word1.replaceAll(" ", "");
		word2=word2.replaceAll(" ", "");
		boolean isAnagram=false;
		char [] word1Arr=word1.toCharArray();
		char [] word2Arr=word2.toCharArray();
		Arrays.sort(word1Arr);
		Arrays.sort(word2Arr);
		if (word1.length()!=word2.length()) {
		    return isAnagram=false;
		}
		for (int i = 0; i < word2Arr.length; i++) {
		    if (word1Arr[i]!=word2Arr[i])
		    {
		        return isAnagram=false;}
		        
		    
		}
		      return isAnagram=true;
		      
		}}