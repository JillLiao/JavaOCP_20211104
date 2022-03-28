package day07_object_oriented.extend1;

public class Student extends Person{
	private int grade;
	
	public Student() {
		
	}
	
	public Student(int grade) {
		
	}
	
	public Student(String name, int age, int grade) {
		setName(name);
		setAge(age);
		this.grade= grade;
	}//只有grade是自己的屬性，其他的name、age是從Person繼承來的，
	 //因此這兩個參數不能用this，而是用setter將收到的參數資料傳給Person，然後再繼承這二個參數

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", Name=" + getName() + ", Age=" + getAge() + "]";
	}
	
	
	
}
