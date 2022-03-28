package day08_object_oriented.case12;

public class Varags {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		int[] values = {10, 20, 30};
		System.out.println(calc.add(values));
		
		System.out.println(calc.add(10, 20));
		
		System.out.println(calc.add(10, 20, 30, 40));
		
		System.out.println(calc.add(10));
		
		System.out.println(calc.add());
	}
}
