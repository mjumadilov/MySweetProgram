package day63;

import java.io.IOException;

public class MethodThatMightThrowCkeckedException {

	public static void main(String[] args) {

		
		
		try {
			playWithFire();
		} catch (IOException e) {
			System.out.println("cought the fish!!!");
		}
	}

	// handle or declare  
	  public static void playWithFire() throws IOException {
	    
	    System.out.println("Playing with fire");
	    
	    //try {
	      throw new IOException();
	    //} catch (IOException e) {
	    //  System.out.println("CAUGHT EXCEPTION");
	    //} 
	    	}
}
