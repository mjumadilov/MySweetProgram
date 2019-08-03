package replNew;

import java.util.Scanner;


public class R153Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
	
		isPalindrome(num);
		
	}
	public static void isPalindrome(int num) {
		
		int rem; int rev = 0;
		
		int temp = num;
		while(temp != 0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(rev == num) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
	
}
