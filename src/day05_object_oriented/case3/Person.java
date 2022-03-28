package day05_object_oriented.case3;

public class Person {
		// 屬性
		String name;
		double height;
		double weight;
		double bmi;
	
		// 建構子 1
		Person(String n, double h, double w) {
			name = n;
			height = h;
			weight = w;
			bmi = w / Math.pow(h / 100, 2); // 自動算出
		}
	
		// 建構子 2
		Person() {
	
		}
	
		// 方法
		void calcBmi() {
			bmi = weight / Math.pow(height / 100, 2); // 自動算出
		}
	
		@Override
		public String toString() {
			return "Person [name=" + name + ", height=" + height + ", weight=" + weight + ", bmi=" + bmi + "]";
		}
}
