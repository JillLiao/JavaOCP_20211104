package day08_object_oriented.overloading;
	//Topic: Overloading
	//目的是讓同樣的方法名稱，但可以帶入不同的參數，以因應各種狀況。例如：各種結帳方法
	//又可分為：1.建構子超載  2.方法超載
public class Submit {
	public void checkOut(int money) {
		System.out.println("1. 結帳:" + money);
	}
	
	void checkOut(String cardNo, int money) {
		System.out.println("2. 結帳:" + money + ", 卡號:" + cardNo);
	}
	
	protected void checkOut() {
		System.out.println("3. 賒帳, 報警!");
	}
}
