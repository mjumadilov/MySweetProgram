package OCApractice;

public class Thomas {

	public static void main(String[] args)
	{
		String[] names={"Thomas","Peter","Washington"};
		String[] pwds=new String[3];
		int i =0;
		try
		{
			for (String n: names)
			{
				pwds[i]=n.substring(2,6);//omas,
				i++;
				
			}
		}
		catch (Exception e)
		{
			System.out.println("Invalid Name");
		}
		for(String p: pwds)
			{
				System.out.println(p);
			}
		
	}
}