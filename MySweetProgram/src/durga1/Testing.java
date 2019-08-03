package durga1;

public class Testing  
{
	public static void main(String[] args) 
	{
		String[] argv = new String[2];
		argv=args;
		for(String v : argv)
		{
			System.out.print(v);
		}
	}
}
/*Whenever we are assigning one array to another array internal elements won't be copied. 
 * Just reference variables will be reassigned. Hence sizes are not required to match.
 
In the above code, after the following line,
argv=args;
both references are pointing to the command-line arguments array only. for loop just 
prints all elements present in that array. Hence the output is: CoreJavaAdvancedJava*/