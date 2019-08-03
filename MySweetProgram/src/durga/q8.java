package durga;

public class q8 {
	public void m1(int i, int j)
	{
		i=i+10;
		j=j+10;
		System.out.println("Inside Method:"+i+".."+j);
	}
	public static void main(String[] args) 
	{
		int x=100;
		int y =200;
		q8 t = new q8();
		t.m1(x,y);
		System.out.println("After Completing Method:"+x+".."+y);	
	}
}