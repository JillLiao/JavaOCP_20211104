package day09_object_oriented.equals;

public class Test {

	public static void main(String[] args) {

Pen p1 = new Pen("Red", 10);
		Pen p2 = new Pen("Blue", 20);
		Pen p3 = new Pen("Red", 10);
		Pen p4 = p1;
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	}

}
