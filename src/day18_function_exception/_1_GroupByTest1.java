package day18_function_exception;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _1_GroupByTest1 {

	public static void main(String[] args) {
		// 3 apple, 2 banana, 1 papaya, 1 orange
		List<String> fruits = Arrays.asList("apple", "orange", "banana", "apple", "papaya", "banana", "apple");
		System.out.println(fruits);

		// Collectors.groupingBy 群組化處理，最後一定會獲得Map的結構，因此應先宣告一個Map集合來盛裝群組化後的資料
		// Collectors.groupingBy(參數1【公式、用什麼分組】, 參數2【分組後要怎麼計算】)
		// 要使用groupingBy，若計算的部分是使用Collectors.counting()，Map value的泛型必需為Long，這是API規定
		// 根據水果名分類，方法1
		Map<String, Long> result = fruits.stream()
				.collect(Collectors.groupingBy(name -> name, Collectors.counting()));
		System.out.println("依據種類分類,方法1: "+ result);
		
		// 根據水果名分類，方法2: Function.identity() 用種類作為分類依據
		Map<String, Long> result2 = fruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("依據種類分類,方法2: "+ result2);
		
		// 根據水果名稱字數長度分類，方法1
		Map<Integer, Long> result3= fruits.stream()
				.collect(Collectors.groupingBy(name -> name.length(), Collectors.counting()));
		System.out.println("依據名稱長度分類,方法1: "+ result3);
		
		// 根據水果名稱字數長度分類，方法2
		Map<Integer, Long> result4= fruits.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println("依據名稱長度分類,方法2: "+ result4);
	}

}
