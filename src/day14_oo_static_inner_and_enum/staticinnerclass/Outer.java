package day14_oo_static_inner_and_enum.staticinnerclass;

public class Outer {
	static int w = 100;
	int x = 200;
	class Inner {
		int y =400;
		void callMe() {
			System.out.println("Inner callMe()");
			System.out.printf("w = %d\n", Outer.w);//也可直接寫w
			System.out.printf("x = %d\n", Outer.this.x);//也可直接寫x
			System.out.printf("y = %d\n",y);
			System.out.printf("z = %d\n", SInner.z);
		}
	}
	
	static class SInner {
		static int z = 300;
		static void callMe() {
			System.out.println("SInner callMe()");
			System.out.printf("w = %d\n", Outer.w);
			// 無法直接取用 x
			//System.out.printf("x = %d\n", Outer.this.x);
			System.out.printf("z = %d\n", SInner.z);
		}
	}
}
