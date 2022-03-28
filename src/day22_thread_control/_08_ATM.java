package day22_thread_control;

public class _08_ATM {
	public static void main(String[] args) {
		_06_Account account = new _06_Account(10000);
		
		_07_Withdraw w1 = new _07_Withdraw(account, 5000);
		_07_Withdraw w2 = new _07_Withdraw(account, 3000);
		_07_Withdraw w3 = new _07_Withdraw(account, 4000);
		
		Thread t1 = new Thread(w1, "小明");
		Thread t2 = new Thread(w2, "小華");
		Thread t3 = new Thread(w3, "小英");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
