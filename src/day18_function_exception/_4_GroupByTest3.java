package day18_function_exception;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class _4_GroupByTest3 {

	public static void main(String[] args) {
		List<_3_Fruit> fruits = Arrays.asList(
				new _3_Fruit("apple", 10, 9.99),
				new _3_Fruit("banana", 20, 19.99),
				new _3_Fruit("orange", 10, 29.99),
				new _3_Fruit("watermelon", 10, 29.99),
				new _3_Fruit("papaya", 20, 9.99),
				new _3_Fruit("apple", 10, 9.99),
				new _3_Fruit("banana", 10, 19.99),
				new _3_Fruit("apple", 20, 9.99)
		);
		System.out.println(fruits);
		//根據水果名分組
		Map<String, Long> result =fruits.stream()
			.collect(Collectors.groupingBy(_3_Fruit::getName, Collectors.counting()));
		System.out.println("根據水果名分組: " + result);
		
		//根據水果名分組，每個種類的水果各有多少個?
		Map<String, Integer> result2 =fruits.stream()
			.collect(Collectors.groupingBy(_3_Fruit::getName,Collectors.summingInt(_3_Fruit::getQty)));
		System.out.println("每個種類的水果數量: " + result2);
		
		//根據水果價格分組
		Map<Double, Long> result3 = fruits.stream()
			.collect(Collectors.groupingBy(_3_Fruit::getPrice, Collectors.counting()));
		System.out.println("根據水果價格分組: "+ result3);
		
		//根據水果價格分組，但要知道組內的成員(詳細列出所有資訊)
		Map<Double, List<_3_Fruit>> result4 = fruits.stream()
				.collect(Collectors.groupingBy(_3_Fruit::getPrice));  //若groupingBy再分組後，沒有說資料該如何被計算，
																	//Compiler會將每個組內的所有成為收集成一個List
		System.out.println("根據水果價格分組+組內成員: "+ result4);
		
		//根據水果價格分組，但分組內容只想知道水果名稱
		Map<Double, List<String>> result5 = fruits.stream()
			.collect(Collectors.groupingBy(_3_Fruit::getPrice, Collectors.mapping(_3_Fruit::getName, Collectors.toList())));
									//注意mapping的用法，是針對stream內的元素額外進行處理/轉換
		System.out.println("根據水果價格分組，但分組內容只列出水果名稱: "+ result5);
		
		//根據水果價格分組，但分組內容只想知道水果名稱，且水果名稱不重複
		Map<Double, Set<String>> result6 = fruits.stream()
			.collect(Collectors.groupingBy(_3_Fruit::getPrice, Collectors.mapping(_3_Fruit::getName, Collectors.toSet())));
					//這時可以利用Set元素不可重複的特性，資料還是可將重複資料丟進去，但java會拒絕存取
		System.out.println("根據水果價格分組，列出各組內水果名稱且不能重複: "+ result6);
	}

}
