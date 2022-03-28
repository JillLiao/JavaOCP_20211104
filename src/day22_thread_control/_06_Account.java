package day22_thread_control;

public class _06_Account {
	private int balance;

	public _06_Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public synchronized void withdraw(int amount) {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 進來提款\n", tName);
		
		// 取得目前最新餘額
		int current_balance = getBalance();
		System.out.printf("%s 看到的最新餘額: $%,d\n", tName, current_balance);
		
		for (int i = 0; i < 999999999; i++);	// 模擬提款忙碌的效果
		
		if (current_balance >= amount) {	// 判斷是否可以提款
			setBalance(current_balance - amount);
			System.out.printf("%s 提款: %,d 成功 餘額: %,d\n", tName, amount, getBalance());
		} else {
			System.out.printf("%s 提款: %,d 失敗 餘額: %,d\n", tName, amount, getBalance());
		}
	}
}
