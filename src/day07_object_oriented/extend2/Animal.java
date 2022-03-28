package day07_object_oriented.extend2;

public class Animal {
	private String name;
	private int legs;
	
	public Animal() {
		
	}
	
	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.println("我會動");
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
		
}
