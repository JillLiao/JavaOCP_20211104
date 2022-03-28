package day17_lambda_function_stream;

import java.util.LinkedHashMap;
import java.util.Map;

public class _8_StreamTest3 {

	public static void main(String[] args) {
		Map<String, Integer> exams = new LinkedHashMap<>();
		exams.put("國文", 100);
		exams.put("數學", 85);
		exams.put("英文", 90);
		
		//利用Java 8 Stream 求平均
		double avg = exams.entrySet().stream().mapToInt(ex -> ex.getValue()).average().getAsDouble();
		System.out.printf("平均分數為: %.2f\n",avg);
	}

}
