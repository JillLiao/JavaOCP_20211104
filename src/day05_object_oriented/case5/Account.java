package day05_object_oriented.case5;

public class Account {
		String name; // 戶名
		int balance; // 帳戶餘額
		Account(String n) {
			name = n;
		}
		
		boolean withdraw(int amount) { // 提款
			if(amount > 0 && amount <= balance) {
				balance = balance - amount;
				return true;
			}
			return false;
		}
		
		boolean save(int amount) { // 存款
			if(amount > 0) {
				balance = balance + amount;
				return true;
			}
			return false;
		}
		
		boolean transfer(int amount, Account toAccount) { // 轉帳
			boolean check = withdraw(amount); // 我提款
			if(check == true) {
				toAccount.save(amount); // 對方存款
			}
			return check;
		}
		@Override
		public String toString() {
			return "Account [name=" + name + ", balance=" + balance + "]";
		}
}
