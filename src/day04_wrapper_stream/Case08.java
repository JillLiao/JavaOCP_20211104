package day04_wrapper_stream;

import java.util.Arrays;

public class Case08 {

	public static void main(String[] args) {
		
		Integer[] age = {20, null ,30};
		// java 8
		int sum = Arrays.stream(age)
						.filter(a -> a != null)
						.mapToInt(a -> a.intValue())
						.sum();
		System.out.println(sum);
		
		int sum2 = Arrays.stream(age)
						 .filter(a -> a != null)
						 .mapToInt(a -> a) // 編譯器 .mapToInt(a -> a.intValue()) auto-unboxing
						 .sum();
		System.out.println(sum2);
	}
}
