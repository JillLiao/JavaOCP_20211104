package day17_lambda_function_stream;

import java.util.Arrays;
import java.util.List;

public class _7_StreamTest2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John","Halen","Bob","Joe");
		//請問人名的平均長度為幾個字?
		double avg = names.stream().mapToInt(String::length).average().getAsDouble();
		System.out.println(avg);
	}

}
