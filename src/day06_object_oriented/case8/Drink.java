package day06_object_oriented.case8;

public class Drink {
	private int amount; // 數量
	private int size;   // 尺寸
	private int total;  // 總計金額
	
	Drink() {
		
	}
	
	Drink(int amount, int size) {
		setAmount(amount);
		setSize(size);
		getTotal();
	}
	
	public void setAmount(int num) {
		if(num > 0) {
			amount = num;
		}
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getTotal() {
		int total = amount * size;
		this.total = total;
		return total;
	}
	
	
	@Override
	public String toString() {
		return "Drink [amount=" + amount + ", size=" + size + ", total=" + total + "]";
	}
}
