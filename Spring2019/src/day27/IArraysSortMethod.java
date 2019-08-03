package day27;

import java.util.Arrays;

public class IArraysSortMethod {

	public static void main(String[] args) {

		String name  = "300 Spartans";
		char[] spartan = name.toCharArray();
		
		Arrays.sort(spartan);
		System.out.println(Arrays.toString(spartan));
		
		
	}

}
