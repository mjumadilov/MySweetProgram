package durga;

public class q9 {

	private char ch;
	public static void main(String[] args) 
	{
		char ch1='a';
		char ch2=ch1;
		ch2='e';
 
		q9 obj1= new q9();
		q9 obj2=obj1;
		obj1.ch='i';
		obj2.ch='o';
 
		System.out.println(ch1+":"+ch2);
		System.out.println(obj1.ch+":"+obj2.ch);		
	}
}