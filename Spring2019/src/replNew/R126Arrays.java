package replNew;

import java.util.Scanner;

public class R126Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	                    
	    int theShort = str[0].length();
	 
	    String minValue = str[0];
	  
	    for (int i = 0; i < 6; i++) {
			if(str[i].length() < theShort) {
				theShort = str[i].length();
				minValue =str[i];
			}
		}
	    System.out.println(minValue);              
	  
	
	}

}
