package day31;

public class FCalculatorReal {

	public static void main(String[] args) {

		
		add(100, 30);		
		subs(100, 30);		
		mult(100, 30);		
		div(100, 30);		
		mod(100, 30);		

		
		
	}
	public static void add(int a, int b) {
		System.out.println("The result is  "+a + b);
	}
	
	public static void subs(int a, int b) {
		System.out.println("The result is  "+ (a - b));

	}
	public static void mult(int a, int b) {
		System.out.println("The result is  "+a * b);

	}
	public static void div(int a, int b) {
		System.out.println("The result is  "+a / b);

	}
	public static void mod(int a, int b) {
		System.out.println("The result is  "+a % b);

	}
}
