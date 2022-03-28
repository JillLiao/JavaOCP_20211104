package day04_wrapper_stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Case06 {

	public static void main(String[] args) {
		
		int[] scores = {100, 80, 90};
		// 求元素個數 = 3
		// 求最大值 = 100
		// 求最小值 = 80
		// 求總分 = 270
		// 求平均 = 90.0
		
		// java 8 (統計涵式)
		IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
		System.out.println(stat);
		System.out.println("求元素個數 = " + stat.getCount());
		System.out.println("求最大值 = " + stat.getMax());
		System.out.println("求最小值 = " + stat.getMin());
		System.out.println("求總分 = " + stat.getSum());
		System.out.println("求平均 = " + stat.getAverage());
	}
}
