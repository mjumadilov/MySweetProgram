package encapsulation;

import java.util.Scanner;

public class CarMax {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Car carOne = new Car();
		carOne.setMake("Acura");
		carOne.setModel("ILX");
		carOne.setType("Sedan");
		carOne.setSpeed(35);
		
		System.out.println("make :" + carOne.getMake());
		System.out.println("Current Speed : "+carOne.getSpeed());
		
		carOne.accelerate(30);
		System.out.println("Current Speed : "+carOne.getSpeed());

		Car carTwo = new Car();
		System.out.println("car2 make :" + carTwo.getMake());
		System.out.println("Car2 model : "+ carTwo.getModel());
		System.out.println("Car 2 type "+ carTwo.getType());
		
		
		Car carThree = new Car("Coupe", "Ford", "Mustang");
		System.out.println("car 3 make :" + carThree.getMake());
		System.out.println("Car 3 model : "+ carThree.getModel());
		System.out.println("Car 3 type "+ carThree.getType());
	}

}
