package replNew;

import java.util.Scanner;

public class R154Fibbonacci {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib(num);
		  }
		  
		  public static void fib(int num){

			  int a = 0;
			  int b = 1;
			  
			  for(int i =1; i<= num; i++){
			    
			    int sum = a + b;
			    
			    a = b;
			    b = sum;
			    
			  }
			    System.out.println(a);
	}

}
