package day08_object_oriented.overloading;
	//加法計算機
public class Calc {
	public Integer add(Integer x, Integer y) {
		System.out.print("方法2: ");
		return x + y;
	}
	
	
	public int add(int x, int y) {
		System.out.print("方法1: ");
		return x + y;
	}
	
	public double add(double x, double y) {
		System.out.print("方法3: ");
		return x + y;
	}
}
