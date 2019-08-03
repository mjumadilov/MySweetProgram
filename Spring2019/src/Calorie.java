import java.util.Scanner;

public class Calorie {

	public static void main(String[] args) {
		double weight = 0;
	    double cal = 0;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter weight in pounds:");
	
	    weight=scan.nextDouble();
	      double met = (10*30)+(30*8)+(6*60*1);
	  double kg = (weight/2.2);
	  cal = (double) (0.0175*kg*met);
	  System.out.println("Calories Burned: " + (int)cal);
	 
	
	}
	}


