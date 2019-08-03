package day65;

import java.util.*;

public class CollectionFramework {

	public static void main(String[] args) {

		String str = "ABCABCEFGADBHYKJSGD";

		String[] strArr = str.split("");

		List<String> lst = Arrays.asList(strArr);
		System.out.println(lst);
		
		Set<String>charSet=new HashSet<>(lst);
		
		System.out.println(charSet);
		System.out.println(charSet.size());
	}
}