package day58;


public interface Drawable {

	
	  public static final String DRAWING_TOOL = "PEN"; 
	  
	  // must be implemented in first concrete class 
	  public abstract void draw(); 
	  
	  // can be used as is or being overriden 
	  public default void drawLine(int n) {
	    
	    System.out.println("DRAWING  "+ n + "LINE ");
	    
	  }
	  // only way to use static method of interface is the static way 
	  // it is not inherited 
	  // this behavior is exclusive to interface 
	  // class's static methods are inherited to sub class 
	  
	  public static void printDrawingTool() {
	    System.out.println("MY TOOL IS " + DRAWING_TOOL);
	  }
	  
	  
	  
	  
	}



/*Task 2 
    
    
    Create an interface called Drawable 
      with below members
      
        constant DRAWING_TOOL  
        abstract method draw 
        
        default method drawLine  accept one int as line count and print drawing n line 
        
        static method printDrawingTool accept no arg and return nothing 
        
    
    Abstract class called Shape , implements Drawable 
      it has instance fields 
        color 
        
      it has abstract method calculateArea 
      it has abstract method toString 
      
    
    Create a concrete Shape class called -- Triangle 
    
      it has height , base   -->> formula to calculate area base * height / 2 
      it has constructor to set all the values 
      
      create a constructor to set all the value 
      
      override all the abstract method that you inherited
      
    
    Optionally create Square -- sub class of Shape 
      it has sizeLength 
      
      create a constructor to set all the fields 
      implement all the unimplemented methods 
      
      
      Eventually in main method create few objects and call their methods 
    */