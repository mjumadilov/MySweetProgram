package OCApractice;

public class Quiz7Q7 {

	public static void main(String[] args) {
        dosum( 10, 20 );
        dosum( 10.0, 20.0 );

  }

public static void dosum(Integer x, Integer y) {
System.out.println("Integer sum is "+(x+y));

}
public static void dosum(short x, short y) {
System.out.println("Integer sum is "+(x+y));

}

public static void dosum(double x, double y) {
   System.out.println("double sum is "+(x+y));

}

public static void dosum(float x, float y) {
 System.out.println("float sum is "+(x+y));

}
//
//public static void dosum(long x, long y) {
//	 System.out.println("long sum is "+(x+y));
//
//	}
//byle, char,short,int,long,float,double

//public static void dosum(int x, int y) {
//   System.out.println("int sum is "+(x+y));
//
//}
}