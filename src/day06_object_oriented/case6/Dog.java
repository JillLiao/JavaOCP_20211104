package day06_object_oriented.case6;

public class Dog {
	static int legs = 4; // 腿  (類別屬性)
	int age = 1;         // 年齡 (物件屬性)
	String kind = "柴犬";     // 種類 (物件屬性)
	
	@Override
	public String toString() {
		return "Dog [legs=" + legs + ", age=" + age + ", kind=" + kind + "]";
	}
}
