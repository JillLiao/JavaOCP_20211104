package day07_object_oriented.extend2;

public class Dog extends Animal{
	
	@Override
	public void move() {
		System.out.println("我會跑");
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + getName() + ", legs=" + getLegs() + "]";
	}
}
