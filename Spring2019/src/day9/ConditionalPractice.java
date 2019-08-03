package day9;

public class ConditionalPractice {

	public static void main(String[] args) {
	int i = 10, j = 21;
	
//	System.out.println("Please enter two integers");
	
//	int i = input.nextInt();
//	int j = input.nextInt();
	
	
    
    if((i>5) || (j%2==1) || (i+j==30)){
    	
        System.out.println("Bingo");
    }else {
        System.out.println("Try again!");
    }
}
}