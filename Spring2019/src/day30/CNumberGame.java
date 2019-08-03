package day30;


public class CNumberGame {

	public static void main(String[] args) {
		
		printTheDoubledNumber(2);
		checkForAge(12);
		
		
	}

	public static void printTheDoubledNumber(int num) {
		num = num*2;
	}
	
	public static void checkForAge(int age ) {
		
		
		if(age > 18) {
			System.out.println("Adult");
		}else {
			System.out.println("Not an Adult");
		}
	}
	
	
}
