package day11_object_oriented_pattern.decorator;

public class Cheese extends SideDish{

	public Cheese(Food food) {
		super(food);
		name = "起司";
		price = 10;
	}

}
