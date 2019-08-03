package repl;

import java.util.Scanner;

public class R96Zombie {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int cityPopulation = scan.nextInt();
      
		int countDay=0;
        
        while (cityPopulation!=0) {
           
        	System.out.println("Day "+countDay+" ["+cityPopulation+"]");
           
        	cityPopulation=cityPopulation/2;
           
        	countDay++;    
        }

}
}
