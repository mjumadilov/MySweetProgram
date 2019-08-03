package day20;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User Name: ");
	    int i=0;
		String name = scan.next();
	    
	    do {
	    	
	    	System.out.print(name.charAt(i)+" ");
	    	++i;
	    }while (i<name.length());
	    
	    
	  }
	
	}


