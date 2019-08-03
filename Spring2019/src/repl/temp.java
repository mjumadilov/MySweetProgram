package repl;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		    
		    float temp;
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter the temperature to convert in to celsius");
		    temp = scan.nextFloat();
		    temp=((temp-32)*5)/9;
		    System.out.println("temp in celsius " + temp);
		    
	}

}
