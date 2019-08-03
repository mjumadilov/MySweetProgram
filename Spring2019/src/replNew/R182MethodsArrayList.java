package replNew;

import java.util.ArrayList;

public class R182MethodsArrayList {

	public static int sum(ArrayList<Integer>ints) {

		int sum = 0;
		for (int i = 0; i < ints.size(); i++) {
			sum = sum+ints.get(i);
		}
		return sum;
	}

}
