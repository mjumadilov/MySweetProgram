package day29;

import java.util.Arrays;

public class ATask {

	public static void main(String[] args) {

	String[][] pizza = { { "Mushroom", "Black Olive", "Green Pepper" }, 
						{ "Spinach", "Green Pepper", "Mushroom" },
						{ "Black Olive", "Black Olive", "Spinach" }, 
						{ "Mushroom", "Mushroom", "Red Pepper" },
						{ "Banana Pepper", "Spinach", "Red Pepper" }, 
						{ "Mushroom", "Green Pepper", "Green Pepper" },
						{ "Spinach", "Green Pepper", "Mushroom" } };

		System.out.println(Arrays.deepToString(pizza));

		for (String[] slice :pizza) {
			
			for(String toppings:slice) {
				System.out.print(toppings + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
		for (int i = 0; i < pizza.length; i++) {
			System.out.println("Slice number : "+ (i +1));
			if(i == 2)
				continue;
			
			for (int j = 0; j < pizza[i].length; j++) {
				
				System.out.print(pizza[i][j] + "|");
			}
			System.out.println();
		}
		
		
		
		
	}

}
