package day8;



	import java.util.Scanner;

	public class ConditionalStatement2 {
	public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	
	double iPhone = 599.99;
	double iPad = 899.99;
	int phoneCount, tabletCount;
	double budget;
	
	System.out.println("what is your budget: ");
	int buy = input.nextInt();
	
	System.out.println("iPhone or iPad?");
	String buy1 = input.next();
	
	if(buy<iPad || buy<iPhone) {
		System.out.println("you can buy a it");
		}
	else {
		System.out.println("out of budget");
	}
	
}
}