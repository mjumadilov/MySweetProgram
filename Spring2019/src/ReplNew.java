import java.util.Scanner;

public class ReplNew {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\"Enter the Item1 and its price:\"");
		String item1 = scan.next();
		double price1 = scan.nextDouble();
		System.out.println("\"Enter the Item2 and its price:\"");
		String item2 = scan.next();
		double price2 = scan.nextDouble();
		System.out.println("\"Enter the Item3 and its price:\"");
		String item3 = scan.next();
		double price3 = scan.nextDouble();
		double totalPrice = price1+price2+price3;
		
				
				
		System.out.println("Item1: "+ item1+ " Price: "+price1 +", "+ "Item2: "+ item2+ " Price: "+ price2+ ", "+"Item3: "+ item3+ " Price: " + price3 );
		
		System.out.println("\"Total price:"+ totalPrice);

		
	
	  }

	}


