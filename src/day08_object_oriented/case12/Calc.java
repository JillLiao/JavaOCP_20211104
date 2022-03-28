package day08_object_oriented.case12;

import java.util.Arrays;

public class Calc {
	public int add(int... values) {
//		int sum = 0;
//		for(int value : values) {
//			sum += value;
//		}
//		return sum;
		
		return Arrays.stream(values).sum();
		
	}
}

//Varags: 用省略號...取代[]符號，即表示宣告使用的data type為陣列 (不訂定長度)，且編譯器會自行將收到的資料轉為陣列
//這樣一來，在Main程式就不需要事先將需要的元素宣告成陣列，直接呼叫方法後將元素以非陣列的形式丟進去就可以了
