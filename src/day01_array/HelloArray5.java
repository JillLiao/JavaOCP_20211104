package day01_array;

import java.util.stream.IntStream;

public class HelloArray5 {

	public static void main(String[] args) {
		int[] scores= {100,90,80,75};
		//求總分與平均(至小數點第一位)
		int sum = 0;
		for(int s:scores) {
			sum += s;
		}
		System.out.printf("總分: %d\n", sum);
		
		double avg = sum / (double)scores.length;
		System.out.printf("平均: %.1f\n", avg);
		
		// Java 8
		sum = IntStream.of(scores).sum();
		avg = IntStream.of(scores).average().getAsDouble();
		System.out.printf("總分: %d\n", sum);
		System.out.printf("平均: %.1f\n", avg);
		
	}

}
