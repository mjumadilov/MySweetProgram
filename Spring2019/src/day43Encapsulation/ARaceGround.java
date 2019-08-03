package day43Encapsulation;

public class ARaceGround {

	public static void main(String[] args) {

	AVehicle car1 = new AVehicle();
	car1.setMake("Tesla");
	car1.setModel("Model X");
	car1.setSpeed(100);
	
	System.out.println(car1.getMake());
	System.out.println(car1.getModel());
		
	car1.increaseSpeed(6);
	
	AVehicle car2 = new AVehicle();
	car2.setMake("BMW");
	car2.setModel("M6");
	car2.setSpeed(100);
	System.out.println(car2.getMake());
	System.out.println(car2.getModel());
	
	
	car2.increaseSpeed(10);
		
		}

	}


