package durga1;

public class newtest 
{
	public static void main(String[] args) 
	{
		Boolean b1 = Boolean.valueOf(null);
		Boolean b2 = Boolean.valueOf(false);
		System.out.print((b1 == b2)+" ");
		System.out.print(b1.equals(b2));
	}
}
/*Explanation
valueOf() methods internally uses autoboxing concept where object 
reusability is there. For Boolean valuOf(), if we pass null then it 
will be considered as false.
Hence in the above code both b1 and b2 represents false and pointing 
to the same object. In all wrapper classes including Boolean, equals() 
method is overridden for content comparison. Hence,
b1==b2====>returns true.
b1.equals(b2)=====>returns true.
*/