package durga;

public class q26 {

	public static void main(String[] args) {
		int[][] n= {{1,2},{3,4}};
		for(int i =n.length-1;i>=0;i--)
		{
			for(int x:n[i])
			{
				System.out.print(x);
			}
		}
	}

}
