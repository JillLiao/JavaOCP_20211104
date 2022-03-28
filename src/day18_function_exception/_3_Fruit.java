package day18_function_exception;

public class _3_Fruit {
	private String name;	
	private Integer qty;
	private Double price;
	
	public _3_Fruit() {
		
	}
	
	public _3_Fruit(String name, Integer qty, Double price) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "_3_Fruit [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
}
