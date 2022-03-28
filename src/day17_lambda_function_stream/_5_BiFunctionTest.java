package day17_lambda_function_stream;

import java.util.function.BiFunction;

/*
	@FunctionalInterface
	public interface BiFunction<T, U, R> {
	R apply(T t, U u);
	}
*/
public class _5_BiFunctionTest {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (x, y) -> x+y;
		Integer result = add.apply(10, 20);
		System.out.println(result);
		
		//請用BiFunction寫一個計算BMI的程式
		BiFunction<Double, Double, Double> bmi = (h, w) -> w/Math.pow(h/100, 2);
		Double getBmi = bmi.apply(170.0, 60.0);
		System.out.printf("您的BMI為: %.2f", getBmi);
		
		// 取最大值 (利用方法參考)
		//BiFunction<Integer, Integer, Integer> max = (a, b) -> Math.max(a, b);
		BiFunction<Integer, Integer, Integer> max = Math::max;	//方法參考
		System.out.println(max.apply(10, 30));
	}

}
