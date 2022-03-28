package day17_lambda_function_stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class _6_StreamTest {

	public static void main(String[] args) {
		//分數
		List<Integer> scores = Arrays.asList(5, -7, 8, 8, 9, 11, 6, -3);
		//正常分數應介於0~10之間
		//請求出總分與平均
		//方法1 利用統計物件，此法較佳
		IntSummaryStatistics stat = scores.stream().filter(sc -> sc >=0 && sc<=10)
				.mapToInt(Integer::intValue).summaryStatistics();
		System.out.println("方法1的總分: "+ stat.getSum());
		System.out.printf("方法1的平均為: %.2f\n",stat.getAverage());
		
		//方法2
		System.out.println("-------------------");
		int sum2 = scores.stream()
				.filter(x -> x >= 0 && x <= 10)
//				.peek(System.out :: println)	// 觀察 stream 裡面的資料，peek就是"偷看"的意思
				.mapToInt(Integer :: intValue)	// 將 x 這個 Integer 物件變成 int
				.sum();
		System.out.println("方法2的總分: "+ sum2);
		
		double avg = scores.stream()
					.filter(x -> x >= 0 && x <= 10)
					.mapToInt(Integer :: intValue)
					.average()
					.getAsDouble();
		System.out.println("方法2的平均: "+ avg);
	}

}
