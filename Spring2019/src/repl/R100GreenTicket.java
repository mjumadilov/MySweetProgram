package repl;

import java.util.Scanner;

public class R100GreenTicket {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int prize = 0;
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int c = scan.nextInt();
	    int d = scan.nextInt();

	    if(a == b && b == c && c == d) {
	    	System.out.println(30);
	    } else if(a == b && a == c || a == d && c == d) {
	    	System.out.println(20);
	    }else if (a != b && b != c || a != c && c !=d || a != c && d !=c)  {
	    	System.out.println(0);
	    	
	    }else {
	    	System.out.println(10);

	    }
	    
	}

}
