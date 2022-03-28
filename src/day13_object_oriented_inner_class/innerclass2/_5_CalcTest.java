package day13_object_oriented_inner_class.innerclass2;

public class _5_CalcTest {

	public static void main(String[] args) {
				// Java 7
				_4_Calc c1 = new _4_Calc() {			//匿名類別(anonymous class)
					public int function(int x, int y) {
						return x + y;
					}
				};
				System.out.println(c1.function(10, 20));
				
				// Java 8 Lambda
				//注意!!!!!Lambda只能在Interface僅一個方法時才能使用!
				_4_Calc c2 = (int x, int y) -> x + y;
				System.out.println(c2.function(10, 20));
				
				_4_Calc c3 = (x, y) -> x - y;
				System.out.println(c3.function(10, 20));
				
				_4_Calc c4 = (int x, int y) -> {
					int sum = x * y;
					return sum;
				};
				System.out.println(c4.function(10, 20));
				
				//_4_Calc c5 = (x, y) -> Math.max(x, y);
				_4_Calc c5 = Math::max;
				//_4_Calc c6 = (x, y) -> Math.min(x, y);
				_4_Calc c6 = Math::min;
				
				System.out.println(c5.function(10, 20));
				System.out.println(c6.function(10, 20));
	}

}
