package durga;

public class  Q5
{
	String myStr="7777";
	public void doStuff(String s)
	{
		int myNum=0;
		try
		{
			String myStr=s;
			myNum=Integer.parseInt(myStr);
		}
		catch(NumberFormatException e)
		{
			System.err.println("Error");
		}
		System.out.println("myStr: "+myStr+" ,myNum: "+myNum);
	}
	public static void main(String[] args) 
	{
		Q5 t = new Q5();
		t.doStuff("9999");
	}
}
