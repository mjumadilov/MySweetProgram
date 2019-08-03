package day50;

public class MethodChanging {

	
	public static void main(String[] args) {
		
	//  STEP1 
	      methodA();
	    // STEP  7 --->>> END OF EXECUTION

	  }

	  public static void methodA() {  
	    // STEP 2 
	    methodB();
	    // STEP 6
	    System.out.println("A is called  ");
	  }

	  public static void methodB() {  
	    // STEP 3
	    System.out.println("B is called  ");
	    // STEP 4
	    methodC();  
	  }
	  
	  
	  public static void methodC() {
	    
	    // STEP 5
	    System.out.println("C is called  ");
	  }
	  
	  
	  
	  
	  
	}
