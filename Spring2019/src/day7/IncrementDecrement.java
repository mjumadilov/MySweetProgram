package day7;

public class IncrementDecrement {

	public static void main(String[] args) {
		int x=3;
		
		// x = ++x;
		x = x++ + --x + x -- +x;
		// step 1--> xx++ = 3 but next time it will show up 4
		// step 2 --> --x at this moment x showed up so value of x is 4
		// step 3 --> x-- 
		
		//System.out.println(x);
		
		//int result = ++x + 5;
		System.out.println(x);
		//System.out.println(result);
		
		//x = ++x;
		//System.out.println(x);
		//x = x++;
		//System.out.println(x);
	}

}
