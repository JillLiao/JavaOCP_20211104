package day00_test;

public class Test01 {
	public static void main(String[] args) {
		int i, j , value;
		i = j = 10;
		
		value= ++i * 10;
		System.out.println("前置運算 i= "+ i +" , " + "value= " + value);
		
		value = j++ * 10;
		System.out.println("後置運算 j= "+ j +" , " + "value= " + value);
		
		double x =100.0/0;
		System.out.println(x);
		
		byte w = (byte) 257;
		System.out.println(w);
		
		byte a = 11;
		short b = 50;		
		int c = a + b ;
		System.out.println(c);
	}

}
