package day26;

import java.util.*;

public class JStringSplit {

	public static void main(String[] args) {
	
		
		String shows = "Game Of Thrones, Mr.Monk, Breaking Bad, Matrix";
		
		String[] showsArrays = shows.split(", ");
		
		System.out.println(Arrays.toString(showsArrays));

	}

}
