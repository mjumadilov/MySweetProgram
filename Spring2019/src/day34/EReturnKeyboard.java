package day34;

public class EReturnKeyboard {

	public static void main(String[] args) {
		 // return keyword 
	    
	    /*
	     * where can we use it ? 
	     *   
	     * method with return type to return a value 
	     *   out of the method 
	     * 
	     * it can be used to get out of any method 
	     *   including method with return type or void method 
	     * 
	     * once the return keyword is reached, method stop executing 
	     * 
	     * break vs return 
	     * 
	     * break ----> loop + switch 
	     * return ---> to return value or terminate method execution 
	     * 
	     *  System.out(0); ---> Shut Down the JVM
	     * 
	     * */
	    int x = 20 ; 
	    System.out.println("abc");
	    if(x > 10 )
	      return ;
	        
	    System.out.println("THE END ");

	    
	    
	    // unreachable code , does not compile 
//	    System.out.println("THE END ");

	  }

	}
