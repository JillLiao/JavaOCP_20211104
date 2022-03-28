package day06_object_oriented.case7;

public class Cat {
	static int count; // 累計數量
	String name; // 貓名
	int age; // 貓齡
	
	Cat() {
		System.out.println("增加一隻貓");
		count++;
		//在 Constructor上動手腳，就可以計算總計有多少物件被建立了
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}
