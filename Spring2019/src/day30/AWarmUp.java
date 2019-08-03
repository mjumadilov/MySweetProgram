package day30;


public class AWarmUp {

	public static void main(String[] args) {

		
		
	sayHello();
	sayHello();

	sayHelloTo("300 Spartans");
	sayHelloTo("Jon Snow");
	sayGoodBye();
   }
	
	public static void sayHello() {
		System.out.println("Hello Spartans");
	}
	public static void sayGoodBye() {
		System.out.println("Bye Spartans");

	}
	
	public static void sayHelloTo(String name) {
		System.out.println("Greeting, "+ name);
		
	}
}




