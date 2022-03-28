package day07_object_oriented.extend1;

public class Teacher extends Person{
	private int level;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, int age, int level) {
		setName(name);
		setAge(age);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Teacher [level=" + level + ", Name=" + getName() + ", Age=" + getAge() + "]";
	}
	
	
}
