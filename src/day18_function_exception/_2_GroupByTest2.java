package day18_function_exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _2_GroupByTest2 {

	public static void main(String[] args) {
		List<Integer> scores = Arrays.asList(100, 40, 70, 80, 90, 30, 20, 55, 35);
		//Arrays.asList()與new ArrayList 再 .add()加資料的差異在於，前者無法修改，後者可以修改。
		//通常在寫系統時會用動態的，但因為要教學範例，所以就用簡便asList了
		System.out.println(scores);
		
		//請問及格與不及格人數各有多少人?方法1
		Map<Boolean, Long> result = scores.stream()
				.collect(Collectors.groupingBy(sc -> sc>=60, Collectors.counting()));
		System.out.println("及格與不及格人數，方法1: "+ result);
		
		//請問及格與不及格人數各有多少人?將true, false改為及格與不及格，以下示範不好的方法，改字串
		System.out.println("改字串顯示是否及格，但這方法不好"+ result.toString().replaceAll("false", "不及格")
															.replaceAll("true", "及格"));
		
		//請問及格與不及格人數各有多少人?方法2 (使用三元運算子顯示及格與不及格，此解較佳)
		Map<String, Long> result2 = scores.stream()
				.collect(Collectors.groupingBy(sc -> sc>=60?"及格":"不及格", Collectors.counting()));
		System.out.println("及格與不及格人數，方法2: "+ result2);
		
		//請問及格與不及格人數各有多少人?改良後導出方法3，反正groupingBy()的第一個參數需要為計算式，
		//那就乾脆將算式提出去作為function，讓stream看起來更簡潔
		Function<Integer, String> func = (x) -> x>=60?"及格":"不及格";
		Map<String, Long> result3 = scores.stream()
				.collect(Collectors.groupingBy(func, Collectors.counting()));
		System.out.println("及格與不及格人數，方法3: "+ result3);
	}

}
