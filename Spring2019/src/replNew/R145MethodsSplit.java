package replNew;

import java.util.*;

import repl.Words40;

public class R145MethodsSplit {

	public static void main(String[] args) {

	Scanner inp = new Scanner(System.in);
	String s = inp.next();
	person(s);
		
	}

	public static void person(String info) {
		
		String [] words = info.split(",");
		System.out.println("person name: "+ words[0]+" last name: "
		+ words[1]+ " age: "+ words[2]);
		
	}
	}






