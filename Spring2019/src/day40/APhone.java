package day40;

public class APhone {

	// these instance variables 
	  // can be accessed 
	  // inside instant methods directly 
	  // just like it's a local variable 
	  // for that method 
	  
	  // if you are outside class
	  // you need an object to access 
	  /// these attributes 
	  
	  String brand;
	  String OS;
	  int capacity;

	  public void ring() {
	    System.out.println("ringing");
	  }

	  public void dial(long number) {
	    System.out.println("dialing " + number);
	  }
	  
	  public void displayBrand() {
	    
	    System.out.println("brand: "+  brand );
	    
	  }
	  
	  

	}