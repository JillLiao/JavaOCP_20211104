package day13_object_oriented_inner_class.innerclass1;

public class _1_Outer {
	int x = 7; // Outer 的物件變數
	
	public class Inner {
		int x = 77; // Inner 的物件變數 

		public void callMe() {
			int x = 777; // 方法區域變數
			System.out.println("Hello Inner");
			System.out.printf("方法區域變數 x = %d\n", x);
			System.out.printf("Inner 的物件變數 x = %d\n", this.x);
			System.out.printf("Outer 的物件變數 x = %d\n", _1_Outer.this.x);
			
		}
	} 
}
