package day8;

public class IncDic {

	public static void main(String[] args) {
		/*int apples = 0;
		System.out.println(apples);
		System.out.println(++apples);
		System.out.println(apples);
		System.out.println(apples++);
		System.out.println(apples);
		apples--;
		System.out.println(apples);
		System.out.println(--apples);*/
		
		int pears = 3;
		int basket = ++pears * 5/pears-- + --pears;
		System.out.println(basket);
		System.out.println(pears);
	}

}
