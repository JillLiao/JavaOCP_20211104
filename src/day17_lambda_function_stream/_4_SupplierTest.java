package day17_lambda_function_stream;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/*
	@FunctionalInterface
	public interface Supplier<T> {
	T get();
	}
*/
public class _4_SupplierTest {

	public static void main(String[] args) {
		// 現在時刻
		Supplier<LocalDateTime> time = () -> LocalDateTime.now();
		LocalDateTime now = time.get();
		System.out.println(now);
//		System.out.println(LocalDateTime.now());
	}

}
