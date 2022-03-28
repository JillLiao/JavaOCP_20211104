package day04_wrapper_stream;

public class Case07 {

	public static void main(String[] args) {
		// int 與 Integer 之間的互動
		// Java 5 以前
		int x = 100;
		Integer y = Integer.valueOf(200);
		System.out.println(x);
		System.out.println(y.intValue());
		System.out.println(x + y.intValue());

		// Java 5(含)之後
		int a = 100;
		Integer b = 200; // Integer.valueOf(200); 由編譯器幫你進行 auto-boxing (自動裝箱)
		System.out.println(a);
		System.out.println(b); // 編譯器會自動加上 b.intValue() 的方法呼叫 auto-unboxing (自動拆箱)
		System.out.println(a + b); // 編譯器會自動加上 b.intValue() 的方法呼叫 auto-unboxing (自動拆箱)
	}
}
