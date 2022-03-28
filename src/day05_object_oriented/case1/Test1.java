package day05_object_oriented.case1;

public class Test1 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.name = "John";
		s1.age = 15;
		s1.height = 170;
		s1.weight = 60;
		
		s2.name = "Mary";
		s2.age = 18;
		s2.height = 165;
		s2.weight = 52;
		
		s3.name = "Alice";
		s3.age = 19;
		s3.height = 175;
		s3.weight = 95;
		
		System.out.printf("%s %d %.1f %.1f\n", s1.name, s1.age, s1.height, s1.weight);
		System.out.printf("%s %d %.1f %.1f\n", s2.name, s2.age, s2.height, s2.weight);
		System.out.printf("%s %d %.1f %.1f\n", s3.name, s3.age, s3.height, s3.weight);
	}
}
