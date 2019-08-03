package OCApractice;

import java.util.ArrayList;

public class Testt {

	public static void main(String[] args) 
	{
	ArrayList<Integer> l = new ArrayList<>();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(null);
	l.remove(2);  //	l.remove(1);

	l.remove(null);
	System.out.println(l);
		}
	}
