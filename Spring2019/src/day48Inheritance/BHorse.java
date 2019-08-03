package day48Inheritance;

import day49.Animal;

public class BHorse extends Animal{

	int shoesCount;
	int horsePower;
	
	public static void main(String[] args) {
	
		BHorse h1 = new BHorse();
		h1.breed = "spartan";
		h1.wild = false;
		h1.horsePower = 600;
		System.out.println(h1.breed);
		System.out.println(h1.horsePower);
	
		
		/*	BAnimal a1 = new BAnimal();
		a1.wild = false;
		
		System.out.println(a1.breed);
		System.out.println(a1.color);
		System.out.println(a1.legCount);
		System.out.println(a1.wild);
		*/
	
	}

}
