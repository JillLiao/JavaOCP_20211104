package day09_object_oriented.equals;

import java.util.Objects;

public class Pen {
	private String color;
	private int price;
	
	public Pen() {
	}
	
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(color, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		return Objects.equals(color, other.color) && price == other.price;
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + ", price=" + price + "]";
	}
}
