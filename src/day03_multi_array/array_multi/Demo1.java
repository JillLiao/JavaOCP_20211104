package day03_multi_array.array_multi;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		int[] x = {100, 90, 80, 70};
		int[] y = {80, 70, 60, 50};
		int[][] z = {x, y};
		
		System.out.println(z[0][2]);
		System.out.println(z[0] + ", " + Arrays.toString(z[0]));
		System.out.println(z);
		System.out.println(z.length);
		System.out.println(z[0].length);
	}

}
