package durga;  //Q1

import java.util.*;
public class Test2
{
	public static void main(String[] args)
	{
		String s1="123";
		String s2="TRUE";
		Integer i1=Integer.parseInt(s1);
		Boolean b1= Boolean.parseBoolean(s2);
		System.out.println(i1+".."+b1);
 
		int i2= Integer.valueOf(s1);
		boolean b2=Boolean.valueOf(s2);
		System.out.println(i2+".."+b2);
	}
}