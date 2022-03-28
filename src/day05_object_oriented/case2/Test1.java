package day05_object_oriented.case2;

public class Test1 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "John";
		emp1.salary = 45000;
		emp1.language = "C#";
		System.out.printf("name: %s salary: %d language: %s\n", emp1.name, emp1.salary, emp1.language);
		
		Employee emp2 = new Employee("Mary", 55000, "Java");
		System.out.println(emp2);
		System.out.println(emp2.toString());
	}
}
