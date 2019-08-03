package durga1;

public class Test  
{
	public static void main(String[] args) 
	{
		int[] a = new int[3];
		a[0]=10;
		a[1]=10.0;
		System.out.println(a[0]+a[1]+a[2]);
	}
}
/*For the int type array, we cannot provide double value. Hence we will get compile time error.
Test.java:7: error: incompatible types: possible lossy conversion from double to int a[1]=10.0;*/