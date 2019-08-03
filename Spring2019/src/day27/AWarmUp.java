package day27;

import com.sun.net.httpserver.Authenticator.Result;

public class AWarmUp {

	public static void main(String[] args) {

		boolean moreThanTen = true;

		int[] five = { 11, 14, 11, 12, 13 };
	
		for (int i = 0; i < five.length; i++) {
			
			if(five[i] <= 10) {
				moreThanTen = false;
				break;
						}
		}
			System.out.println(moreThanTen);
		
	}

}
