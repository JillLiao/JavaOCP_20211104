package day14_oo_static_inner_and_enum.staticinnerclass;

public class OuterTest {

	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.callMe();
		
		System.out.println("---------------");
		
		Outer.SInner sin = new Outer.SInner();
		//static class不需要new，可以直接取用
		sin.callMe();

	}

}
