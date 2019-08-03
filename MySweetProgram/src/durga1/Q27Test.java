package durga1;

public class Q27Test {

	public static void main(String[] args) 
	{
		char c1 = 'a';//Line-1
		char c2 = 97;//Line-2
		char c3 = 65536;//Line-3
		char c4 = -10;//Line-4
		System.out.println(c1+c2+c3+c4);
	}
}
/*The only allowed range of values for char data type is: 0 to 65535. 
 * Hence 65536 and -10 are not allowed for char type. Due to this we 
 * will get compile time error at Line-3 and Line-4.
 
Test.java:7: error: incompatible types: possible lossy conversion from 
int to char char c3 = 65536;//Line-3 Test.java:8: error: incompatible 
types: possible lossy conversion from int to char char c4 = -10;//Line-4*/