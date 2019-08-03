package durga;

public class q31 {

	public static void main(String[] args) 
	{
		int i =5;
		while(isAvailable(i))
		{
			System.out.print(i);//Line-1
			--i;
			//Line-2
		}
	}
	public static boolean isAvailable(int i)
	{
		return i-- > 0 ? true : false;// Line-3
	}
}