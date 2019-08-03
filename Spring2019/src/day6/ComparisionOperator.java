package day6;

public class ComparisionOperator {

	public static void main(String[] args) {
		// if you have two numbers how to compare them
		
		int a = 10, b = 10, c= 15;
		System.out.println(" Are they equal : " + (a==b));
		//System.out.println(a==c);
		
		// checking for equality
		System.out.println(" Are they equal : "+ (a!=b));
		System.out.println(" is a greater or equal to b : "+ (a>=b));
		System.out.println(" is a less or equal to b : "+ (a<=b));
		System.out.println(" is a less than b : "+ (a<b));
		
		boolean isAequalToB = a==b; 
	}

}
