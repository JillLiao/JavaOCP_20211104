package day11_object_oriented_pattern.abstract2;

public class _3_Tank extends _1_Car implements _6_Weapon{

	@Override
	public void move() {
		System.out.println("用履帶走");
	}

	@Override
	public void fire() {
		System.out.println("榴彈砲");
	}

}
