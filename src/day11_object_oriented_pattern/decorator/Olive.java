package day11_object_oriented_pattern.decorator;

public class Olive extends SideDish{

	public Olive(Food food) {
		super(food);
		name = "橄欖";
		price = 10;
	}

}
