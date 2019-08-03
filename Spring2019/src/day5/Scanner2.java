package day5;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your firstname : ");
		String firstName = input.next();
		System.out.println("Enter your lastname :  ");
		String lastName = input.next();
		System.out.println("Birthday(m/d) :  ");
		String Birthday = input.next();
		System.out.println("In which city do you live? :  ");
		String lives = input.next();
		System.out.println("In which State do you live? :  ");
		String State = input.next();
		System.out.println("Here is your short info: " + firstName+ " "
		+lastName+ ", " + Birthday+ ", " + lives+" " +State+ 
		". Good Luck"+ " "+firstName+ ", "+ "you will be the best programmer!"); 
		
		

		
		
		

		
	}

}
