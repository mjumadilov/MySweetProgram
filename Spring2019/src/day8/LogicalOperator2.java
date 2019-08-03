package day8;

public class LogicalOperator2 {

	public static void main(String[] args) {
		
		boolean isHungry = true;
		boolean isBreakTime = false;
		
		System.out.println("are you hungry and is it break time "+(isHungry&&isBreakTime));
		System.out.println("are you hungry and is it break time "+(isHungry||isBreakTime));
	
		boolean reverseIsHungry = !isHungry;
		System.out.println("Original ishungry "+ isHungry);
		System.out.println("is hungry "+ reverseIsHungry);
		
		boolean isYourLunchReady = true;
		
		boolean areWeSuperReady = isHungry && isBreakTime && isYourLunchReady;
	}

}
