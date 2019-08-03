package durga1;

public class Q15Test {

	static int i =10;
	int j = 20;
	public void m1()
	{
		i++;
		j++;
	}
	public static void main(String[] args) 
	{
		Q15Test t1 = new Q15Test();
		t1.m1();
 
		Q15Test t2 = new Q15Test();
		t2.m1();
 
		System.out.print(t2.i+" "+t2.j);
	}	
}

/*In the case of instance variable, for every object a separate copy will 
 be created, but only one copy of static variable will be created which is 
 shared by all objects of that class. In the above code instance variable 
 will be incremented only once per object, but static variable incremented 
 for both objects. Hence the output is: 12 21*/
 