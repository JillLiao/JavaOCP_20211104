package day11_object_oriented_pattern.decorator;

public class SideDish extends Food{
	
	protected Food food;
	
	public SideDish(Food food) {	//若這裡不自己寫一個帶參數建構子，就被硬塞一個隱含的空建構子，空建構子無法將參數(food)
		this.food = food;			//帶入SideDish(父類別)中，會連帶造成後面繼承SideDish的其他配料(子類別)無法連續在
	}								//food上面疊加資料
	
	@Override
	public String getName() {
		return name + "(" + price + ") + " + food.getName();
	}

	@Override
	public int getPrice() {
		return price + food.getPrice();
	}

}
