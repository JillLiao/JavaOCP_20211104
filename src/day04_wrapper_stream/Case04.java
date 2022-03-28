package day04_wrapper_stream;

import java.util.Arrays;

public class Case04 {

	public static void main(String[] args) {
		String[] scores = {"100", "-999", "90", null, "80"};
		// 求總分=?
		// java 7
		int sum = 0;
		for(String score : scores) {
			if(score != null) { // filter
				int s = Integer.parseInt(score); // mapToInt
				if(s > 0) { // filter
					sum += s; // sum = sum + s;
				}
			}
		}
		System.out.println(sum);
		// java 8
		int sum2 = Arrays.stream(scores)
						 .filter(s -> s != null)
						 .mapToInt(s -> Integer.parseInt(s))
						 .filter(s -> s > 0)
						 .sum();
		System.out.println(sum2);
	}

}
