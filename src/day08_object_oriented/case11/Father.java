package day08_object_oriented.case11;

public class Father {
	int cash = 0;
	public Father(int cash) {
		this.cash = cash;
		System.out.println("執行 Father 建構子, cash = " + cash);
	}
	public void profit() {
		System.out.println("profit = "+cash);
	}
}
