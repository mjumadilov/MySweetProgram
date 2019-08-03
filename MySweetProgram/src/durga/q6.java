package durga;

public class q6 {
	public static int x=100;
	public int y = 200;
	public String toString()
	{
		return y+":"+x;
	}
	public static void main(String[] args) 
	{
		q6 t1 = new q6();
		t1.y=300;
		System.out.println(t1);
		q6 t2 = new q6();
		//t2.x=300;
		System.out.println(t2);		
	}
	
}