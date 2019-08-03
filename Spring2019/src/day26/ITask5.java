package day26;

import java.util.*;

public class ITask5 {

	public static void main(String[] args) {
		String groceries = "Tomatoes, potatoes, cheese, bread, "
				+ "onions, pepper, grapes, oranges, apples"; 
		
		String[] words = groceries.split(", ");
		
		System.out.println(Arrays.toString(words));
		
		System.out.println(words.length);
		
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].trim());
		}
		//char[] nameChars = groceries.toCharArray(); 
	    
	  //  System.out.println( Arrays.toString(nameChars) );
		
	}

}
