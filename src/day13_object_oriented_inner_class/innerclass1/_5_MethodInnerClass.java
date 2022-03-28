package day13_object_oriented_inner_class.innerclass1;
//一般外部類別
public class _5_MethodInnerClass {
	// 方法
		public void appearance() {
			// x 若要給方法內部類別使用, 則必須是 final 
			// Java 8 以前要明確宣告 final
			// Java 8(含)以後則不用
			int x = 100; // 方法區域變數
			//x = 101; // 因為方法內部類別有使用 x , 所以 x 就變成 final 變數, 因次 x 值不可修改
			// 方法內部類別
			class Inner {
				void callMe() {
					System.out.println("Hello Inner method");
					System.out.println("方法區域變數 x=" + x);
				}
			}
			// 建立實體
			Inner in = new Inner();
			in.callMe();
		}
}
