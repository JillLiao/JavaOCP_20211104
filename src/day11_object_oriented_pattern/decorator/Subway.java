package day11_object_oriented_pattern.decorator;

public class Subway {

	public static void main(String[] args) {
		Food food = new Bread();	//
		food = new Ham(food);
		food = new Lettuce(food);
		food = new Onion(food);
		food = new Olive(food);
		food = new Tomato(food);
		food = new Tuna(food);
		food = new Tuna(food);
		food = new Cheese(food);
		
		//總共點了哪些食材?
		System.out.println(food.getName());
		//結帳
		System.out.println(food.getPrice());
	}

}
