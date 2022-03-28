package day05_object_oriented.case2;

public class Employee {
	
	String name; // 姓名
	int salary; // 薪水
	String language; // 工作中使用的程式語言
	
	// 建構子 (建構 = new)
	Employee(String n, int s, String l) {
		name = n;
		salary = s;
		language = l;
	}
	
	Employee() {
		
	}
	
	// 方法
	@Override // 覆寫
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", language=" + language + "]";
	}
}
