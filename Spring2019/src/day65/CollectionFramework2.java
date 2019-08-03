package day65;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionFramework2 {

	public static void main(String[] args) {
		
	    String str = "ABCABCEFGADBHYKJSGD"; 

		Set<Character> charSet = new HashSet<>(); 
		    
		    for (int i = 0; i < str.length(); i++) {
		      //System.out.println(  str.charAt(i)  );
		      charSet.add( str.charAt(i) ) ; 
		    }
		    System.out.println(  charSet);
		    
	 }
}
