package day17_lambda_function_stream;

import java.util.function.Function;

/*
	@FunctionalInterface
	public interface Function<T,R> {
	R apply(T t);
	}
*/
public class _2_FunctionTest {

	public static void main(String[] args) {
		// 得到某一個字串的長度
		// Function<String, Integer> func = (x) -> {return x.length();};
		// Function<String, Integer> func = (x) -> x.length(); // 丟入String，出來一個Integer
		Function<String, Integer> func = String::length;	//方法參考

		Integer lens = func.apply("HelloWorld");
		System.out.println(lens);
		
	}

}
