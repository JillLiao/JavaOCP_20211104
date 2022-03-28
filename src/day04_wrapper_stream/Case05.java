package day04_wrapper_stream;

import java.util.Arrays;

public class Case05 {

	public static void main(String[] args) {
		
		String[] scores = {"100", "-990", "95", null, "200", "", "84"};
		// 求0~100之間 分數是 5 的倍數的總和 = (答案是 195)
		// java 8
		int sum = Arrays.stream(scores)
				        .filter(s -> s != null)
				        .filter(s -> !s.equals(""))
				        .mapToInt(s -> Integer.parseInt(s))
				        .filter(s -> (s >= 0 && s <= 100))
				        .filter(s -> s % 5 == 0)
				        .sum();
		System.out.println(sum);
	}
}
