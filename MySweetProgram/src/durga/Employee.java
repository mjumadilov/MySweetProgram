package durga;



public class Employee {
	String name;
	boolean contract;
	double salary;
	Employee()
	{
		//line-1

	}
	public String toString()
	{
		return name+":"+contract+":"+salary;
	}
	public static void main(String[] args)
	{
		Employee e = new Employee();
		//Line-2
		
		
		System.out.println(e);
	}
}
