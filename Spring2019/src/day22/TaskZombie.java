package day22;

import java.util.Scanner;

public class TaskZombie {

	public static void main(String[] args) {
		// ZOMBIE ATTACH REPL 96
	    
	    // WARM UP NOW
	    Scanner scan = new Scanner(System.in); 
	    System.out.println("Enter inhabitants count : ");
	    int inhabitants = scan.nextInt(); 
	    
	    // each day half of the population is gone by zombie attack
	    /*
	     * example1- inhabitants is 6

	      Day 0 [6]
	      Day 1 [3]
	      Day 2 [1]
	    ---- EXTINCT ----
	     * */
	    int day = 0 ; 
	    while(inhabitants>0) {
	      
	      System.out.println("Day "+ day + " [" +inhabitants + "]") ;  
	      inhabitants = inhabitants/2 ; 
	      day++ ;  
	    }
	    
	    System.out.println("---- EXTINCT ----");

	  }

	
	}


