package day22_thread_control;

public class _07_Withdraw implements Runnable{
	private _06_Account account;
	private int amount;
	
	public _07_Withdraw(_06_Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		account.withdraw(amount);
	}
}
