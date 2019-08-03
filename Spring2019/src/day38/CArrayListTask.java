package day38;

import java.util.*;

public class CArrayListTask {

	public static void main(String[] args) {

		 ArrayList<Integer> lst = new ArrayList<>();
		    // adding 1-100 to the list 
		    for(int i=1; i<=100; i++) {
		      lst.add(i);
		    }
		    System.out.println(  lst  );
		    
		    
		    int sum = 0;
		    for (int i = 0; i < lst.size(); i++)
		    {
		      sum+= lst.get(i);
		    }
		    int average = sum/ lst.size(); 
		    System.out.println( "the average is : " + average);
		    
		
	}

}
