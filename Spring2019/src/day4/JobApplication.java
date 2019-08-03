package day4;

public class JobApplication {

	public static void main(String[] args) {
	int score = 100; // declaring and assigning in one statement
	
	int x, y, z ;
	x = 10;
	y = 20;
	z =  x + y;
	
	// once you is one variable name, you can not reuse that variable
	//ex: int score 200
	score = 200;
	
	System.out.println( z );
	System.out.println(score);
	
	/*	Naming variable
	 *  is this a valid name for a variable
	 * int abs ; ---good
	 * int 123 ; ----bad
	 * int a123; --- good
	 * int_a; ---good
	 * int $ ; ---good -- not recommended
	 * int a-b ; bad
	 * int _123;--- good --not recommended
	 * 
	 * RULES
	 * 		57 Reserved keyboards should be avoided.
	 * 		you can use letters a-z A-Z
	 * 		numbers, just do not start with number
	 * 		only 2 special character _$
	 * 
	 *Guideline :
	 *		for more than one word, use camel case int gameScore ; 
	 *		make your variable name tell what do you want to store 
	 *		int countOfOnLinestudent = 300
	 * 
	 * 
	 * Naming a class rule:
	 * 		avoid reserved keyboards
	 * 		It should be whole word without space
	 * 		camelCase, 
	 * 		
	 */	
	 
	 String name = "Marat Jumadilov";
	 String city = "Dallas";
	 String state = "Texas";
	 String nationality = "Kyrgyz";
	/* System.out.println("My name is  "+ name);
	 System.out.println("My city is  "+ city);
	 System.out.println("My state is  "+ state);
	 System.out.println("My nationality is  "+ nationality);
	 */
	 
	 System.out.println("My name is "+ name 
			+ ". My city is  " + city
	 		+ ". My State is " + state 
	 		+ ". My naionality is " + nationality);
			 
			
	
	}

}
