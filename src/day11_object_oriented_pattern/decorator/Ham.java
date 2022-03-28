package day11_object_oriented_pattern.decorator;

public class Ham extends SideDish{

	public Ham(Food food) {
		super(food);
		name = "火腿";
		price = 30;
	}

}
