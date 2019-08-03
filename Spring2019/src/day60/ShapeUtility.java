package day60;


import day58.*;

public class ShapeUtility {

	public static void main(String[] args) {

		describeTheShape (new Triangle("Red", 12, 10));

		Shape s1= new Triangle("Red", 12, 10);
		describeTheShape(s1 );
		describeTheShape(new Square("blue", 5));
		
		describeTheShape(new Dog());
		
	}

	public static void describeTheShape(Shape anyShape) {
		System.out.println("calling describeTheShape(Shape anyShape)");
		anyShape.draw();
		
	}
	public static void describeTheShape(Triangle anyTriangle) {
		System.out.println("calling describeTheShape(Triangle anyTriangle)");

		anyTriangle.draw();
		
	}
	public static void describeTheShape(Object anyObject) {
		System.out.println("calling describeTheShape(Object anyObject)");

	//	anyObject.draw();
		
	}

}
