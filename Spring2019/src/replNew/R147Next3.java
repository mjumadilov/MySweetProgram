package replNew;
import java.util.Scanner;

public class R147Next3 {
	  
	  public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();
	  
	     next3(num); 
	  
	  }
	  
	  public static void next3(int num){
	    
		 for (int i = 0; i < 3; i++) {
			 num = num+ 1;
		}
			System.out.println("next 3 are " + num);

		  // System.out.println("next 3 are:"+ (num + 1)+" "+(num+2 )+" "+(num+3));
		  
		  
	  }
	 
	 
	}