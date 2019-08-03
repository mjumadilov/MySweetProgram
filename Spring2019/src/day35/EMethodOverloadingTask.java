package day35;

public class EMethodOverloadingTask {

	public static void main(String[] args) {

	addNums(5, 10);
	addNums(5, 10,7);
	addNums(5, 10, 7, 5);
		
		
	}
	public static int addNums(int x,int y) {
		return x+y;
	}
	public static int addNums(int x,int y,int z) {
		return x+y+z;
	}
	public static void addNums(int x,int y,int z,  int w) {
		System.out.println( x+y+z+w);
	}
}


