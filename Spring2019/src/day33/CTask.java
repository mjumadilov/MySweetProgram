package day33;

import java.util.*;

public class CTask {

	public static void main(String[] args) {

		double[] n = { 1.1,2.2,4.4,5.5 };
		double[] nn = { 5.5, 6.6, 4.4, 3.3 };
		System.out.println(Arrays.toString(combineArray(n, nn)));
	}

	public static double[] combineArray(double[] n, double[] nn) {
		double length = n.length + nn.length;
		double[] combine = new double[(int) length];

		System.arraycopy(n, 0, combine, 0, n.length);
		System.arraycopy(nn, 0, combine, nn.length, nn.length);
		return combine;

	}
}