package OCApractice;

import java.util.*;

 class Test {

	String name;

	public Test (String name){

	this.name=name;

	}

	}


	public class Patient{

	public static void main(String [ ] args){

	List ps = new List();

	Test p2 = new Test ("mike");

	ps.add(p2);

	//line 14
	int  f  =  ps.indexOf(p2);
	if (f>=0){

	System.out.print("mike found");

	}

	}

	}