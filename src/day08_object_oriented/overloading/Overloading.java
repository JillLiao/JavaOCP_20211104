package day08_object_oriented.overloading;

public class Overloading {
	//所有方法名稱都是x，所以帶入的參數數量、或data type必須不同，同名方法才能同時存在
	
	int x(int d) {
		System.out.println("One");
		return 0;
	}
	
	String x(String d) {
		System.out.println("Two");
		return null;
	}
	
	double x(double d) {
		System.out.println("Three");
		return 0.0;
	}
	
	public static void main(String[] args) {
		Overloading o1 = new Overloading();
		o1.x(10);	//正統寫法，物件彈性大。這裡實作出One
		
		new Overloading().x("10");	//簡單偷懶寫法，盡量不要用。這裡實作出Two
		new Overloading().x(10.0);	//實作出Three
		//簡單寫法是建立物件後直接就使用物件的方法，但就只能使用1次，不能再對物件做其他事情了，當然也沒有物件變數可以用
	}
}
