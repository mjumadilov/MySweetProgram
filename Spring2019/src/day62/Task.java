package day62;

public class Task {

	public static void main(String[] args) {

		
		try {
			int[] nums= {1,2,3,4};

			System.out.println(nums[200]);
		}catch (ArrayIndexOutOfBoundsException aibe) {
			System.out.println("Out of bound happen, this is catch block message");
		}
		System.out.println("ending of the code");
	}

}
