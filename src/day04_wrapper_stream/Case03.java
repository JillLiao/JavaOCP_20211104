package day04_wrapper_stream;

import java.util.Arrays;

public class Case03 {

	public static void main(String[] args) {
		
		String[] scores = {"100", "90", null, "80"};
		// 求總分=?
		// java 7
		int sum = 0;
		for(String score : scores) {
			if(score != null) { // 過濾 filter
				sum += Integer.parseInt(score); // 轉換 mapToInt
			}
		}
		System.out.println(sum);
		// java 8
		int sum2 = Arrays.stream(scores) // 建立串流
						 .filter(s -> s != null) // 過濾 filter
						 .mapToInt(s -> Integer.parseInt(s)) // 轉換 mapToInt
						 .sum(); // 得到總和
		System.out.println(sum2);
	}

}
