package day11_object_oriented_pattern.decorator;
//元件+裝飾元件 = 成果 
//利用遞迴的效果將裝飾元件層層疊加上去
//每當new一個裝飾原件上去，原物件的內容就更加豐富，但物件在heap區的位址也會跟著變動
public abstract class Food {
	protected String name;
	protected int price;
	
	public abstract String getName();	//為了讓繼承者強制override，所以將方法宣告為abstract
	public abstract int getPrice(); 	//再一個abstract method
}
