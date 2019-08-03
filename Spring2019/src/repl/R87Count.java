package repl;

import java.util.Scanner;

public class R87Count {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word =  scan.next();
		
		
		int count = 0;
        for(int i =0; i < word.length()-1; i++) {
            if(word.substring(i, i+4).contains("java"))
                count++;

          //  String twoChar = word.substring(i, i+4);
            
           // System.out.print(twoChar+" ");
            
            //if(twoChar.equals("java")) {
           // }
            }
            System.out.println();
            System.out.println(count);
		
		
	}

}
