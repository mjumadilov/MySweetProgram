package day53;


public class TropicalFruits extends Fruit{

	public static void main(String[] args) {
		
		
		generateJuice();
		Fruit.generateJuice();
		TropicalFruits.generateJuice();
		
		
	}
	//hiding static methods
	public static void generateJuice() {
		System.out.println("generate TropicalFruit Juice");
	}
	
}
//______different class______

class Fruit{
	
	public static void generateJuice() {
		System.out.println("generate general Juice");
	}
}



