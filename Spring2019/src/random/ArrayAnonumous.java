package random;

public class ArrayAnonumous {

	public static void main(String[] args) {

		printArray(new int[] {10,22,44,66,88});
		
		
		
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
