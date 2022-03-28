package day21_thread;

public class _08_LuckyNumber_Main {

	public static void main(String[] args) {
		_07_LuckyNumber num1 = new _07_LuckyNumber();
		_07_LuckyNumber num2 = new _07_LuckyNumber(123);
		
		Thread t1 = new Thread(num1,"\t小明");
		Thread t2 = new Thread(num2,"小華");
		t1.start();
		t2.start();
	}

}
