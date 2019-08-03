package repl;

import java.util.Scanner;

public class R95ShoppingList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		String moreMore = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		
		do {
			System.out.println("Enter Item "+ count + " and it's price:");
			item = scan.next();
			price = scan.nextDouble();
			shoppingListReport = shoppingListReport + 
			"Item" + count+ ":" +item+ " Price: "+ price +", ";
			
			totalPrice = totalPrice + price;
			System.out.println("Add one more item?");
			moreMore = scan.next();
			count++;
			
		}while(moreMore.contains("yes"));
		int listTotal = shoppingListReport.length();
		String finalList = shoppingListReport.substring(0, listTotal - 2);
		
		System.out.println(finalList);
		System.out.println("Total price: " + totalPrice);
		
	}
}
