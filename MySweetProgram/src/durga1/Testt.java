package durga1;

public class Testt 
{
	public static void main(String[] args) 
	{
		int a =10;
		double b = 10.0;
		boolean c= true;
		System.out.println(++a + ++b + ++c);  //<=== this is the problem
	}
}
/*increment and decrement operators are applicable for all primitive data types except boolean. In the above code we are trying to apply for boolean type and hence we will get compile time error.
error: bad operand type boolean for unary operator '++'
System.out.println(++a + ++b + ++c);*/