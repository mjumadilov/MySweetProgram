package durga1;

public class Q17Test {

	public static void m1(int x)
	{
		x=20;
	}
	public static void main(String[] args) 
	{
		int x =10;
		
		m1(x);
		
		System.out.println(x);
	}
}
/*Explanation
If we pass any primitive to a method as argument, and within the method 
if we are performing any changes to the primitive value, those changes 
won' be reflected to the caller. In this case duplicate copy of that 
primitive value will be maintained.*/