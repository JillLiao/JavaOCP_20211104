package day17_lambda_function_stream;

import java.util.function.Consumer;

/*
	@FunctionalInterface
	public interface Consumer<T> {
	void accept(T t);
	}
*/
public class _1_ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> hello = (x) -> System.out.println("Hello "+ x);	//在import function的狀況下，即便自身為一個運算式
																//，但也可作為其他方法的參數
		//1.
		hello.accept("John");		
		//2.
		sayHello("Mary", hello);
	}
	
	public static void sayHello(String name, Consumer<String> hello) {	//方法的參數可以為運算式!
		hello.accept(name);
	}

}
