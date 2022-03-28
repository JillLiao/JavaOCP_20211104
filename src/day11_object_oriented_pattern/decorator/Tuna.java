package day11_object_oriented_pattern.decorator;

public class Tuna extends SideDish{

	public Tuna(Food food) {
		super(food);
		name = "鮪魚";
		price = 25;
	}

}
