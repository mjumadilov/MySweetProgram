package durga1;

public class Tester
{
	public static void main(String[] args) 
	{
		int x =10;
		String s= "Java";
		if(s.equals("Java"))
		{
			int y = 20;
			x= x+30;
		}
		System.out.println(x+"..."+y);
	}
}

/*y is the local variable of if block and cannot be used outside of 
 * the block. Hence we will get compile time error.*/
 */