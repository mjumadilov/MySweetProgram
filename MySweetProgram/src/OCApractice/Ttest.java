package OCApractice;

class MyString
{
	String msg;
	MyString(String msg)
	{
		this.msg=msg;
	}
}
public class Ttest 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello "+ new StringBuilder("Java SE 8")); //Java SE 8
		System.out.println("Hello "+ new MyString("Java SE 8")); //hashcode
	}		
}