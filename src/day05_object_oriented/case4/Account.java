package day05_object_oriented.case4;

public class Account {
		String name; // 戶名
		int balance; // 帳戶餘額
		Account(String n) {
			name = n;
		}
		void withdraw(int amount) { // 提款
			balance = balance - amount;
		}
		void save(int amount) { // 存款
			balance = balance + amount;
		}
		void transfer(int amount, Account toAccount) { // 轉帳
			withdraw(amount); // 我提款
			toAccount.save(amount); // 對方存款
		}
		@Override
		public String toString() {
			return "Account [name=" + name + ", balance=" + balance + "]";
		}
}
