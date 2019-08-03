package repl;

import java.util.Scanner;

public class MrsKursun {

	public static void main(String[] args) {
	String name2 = "Dilyara";
	int count = name2.length();
	System.out.println(name2.substring(count-1, count));
	
	//System.out.println(name2.substring(0, 2));
	
	int midPoint = count/2;
	System.out.println(midPoint);
	System.out.println(name2.substring(midPoint, count));
	
	}
		
	

}
