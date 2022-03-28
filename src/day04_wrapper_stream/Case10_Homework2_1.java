package day04_wrapper_stream;

import java.util.Arrays;

public class Case10_Homework2_1 {

	public static void main(String[] args) {
		Integer [][] scores = { { 100, 90 }, { 80, 70, 60 } };
		// 求總分 = 400
		int sum = Arrays.stream(scores)
				.flatMapToInt(sco -> Arrays.stream(sco).mapToInt(s ->s))
				.sum();	
		System.out.println(sum);
	}
}
