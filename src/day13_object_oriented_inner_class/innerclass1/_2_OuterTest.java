package day13_object_oriented_inner_class.innerclass1;

public class _2_OuterTest {

	public static void main(String[] args) {
		_1_Outer ou = new _1_Outer();
		_1_Outer.Inner in = ou.new Inner();
		in.callMe();
		
		System.out.println("----------");
		
		_1_Outer.Inner in2 = new _1_Outer().new Inner();
		in2.callMe();
		
		System.out.println("----------");
		
		new _1_Outer().new Inner().callMe();
	}

}
