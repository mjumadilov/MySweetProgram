package day25;

//import java.util.Arrays;

import java.util.*;
public class CStringArray {

	public static void main(String[] args) {

		String favorite[] = {"Matrix", "Avatar", "Mr.Monk", "Life"};

		System.out.println(Arrays.toString(favorite));
		
		System.out.println(favorite[2].length());
		
		System.out.println(favorite.length);
		
	/*	int i = 0;
		
		System.out.println(favorite[i].length());
		i++;
		System.out.println(favorite[i].length());
		i++;
		System.out.println(favorite[i].length());
		i++;
		System.out.println(favorite[i].length());
		i++;
		*/
		
		for (int i = 0; i < favorite.length; i++) {
			System.out.println(favorite[i] + "- char count is : " + favorite[i].length());
			
			
		}
	int max = favorite[0].length();
	for (int i = 1; i < favorite.length; i++) {
		if(favorite[i].length() > max) {
			max = favorite[i].length();
		}
		
		
	}
	System.out.println(max);
	}

}
