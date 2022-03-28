package day11_object_oriented_pattern.abstract2;

public class _5_Fighter extends _4_Airplane implements _6_Weapon{

	@Override
	public void speed() {
		System.out.println("超音速飛行");
	}

	@Override
	public void fire() {
		System.out.println("飛彈");
	}

}
