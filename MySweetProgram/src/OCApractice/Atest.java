package OCApractice;

public class Atest {

	public static void main(String[] args) 
	{
		String[][] s= new String[2][];  //		String[][] s= new String[2][5];

		s[0] = new String[2];
		s[1] = new String[5];
		int i =97;
 
		for(int a =0;a < s.length; a++)
		{
			for(int b =0; b< s.length; b++)
			{
				s[a][b]=""+i;
				i++;
			}
		}
		for( String[] s1: s)
		{
			for (String s2 : s1)
			{
				System.out.print(s2+" ");
			}
		    System.out.println();
		}
	}
}
