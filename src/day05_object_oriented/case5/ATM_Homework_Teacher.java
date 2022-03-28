package day05_object_oriented.case5;
//作業: 做出轉帳功能
import java.util.Scanner;

public class ATM_Homework_Teacher {
	Account acct; // 帳戶(插卡)
	Account acctT; // 轉帳對象
	
	ATM_Homework_Teacher(Account acct) {
		this.acct = acct;
	}
	
	ATM_Homework_Teacher(Account acct, Account acctT) {
		this.acct = acct;
		this.acctT = acctT;
	}
	
	void menu() {
		System.out.println("------------");
		System.out.println("1. 查詢帳戶");
		System.out.println("2. 存款");
		System.out.println("3. 提款");
		if(acctT != null) {
			System.out.println("4. 轉帳");
		}
		System.out.println("0. Exit");
		System.out.println("------------");
		System.out.print("請選擇: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		switch (n) {
			case 1:
				System.out.println(acct);
				break;
			case 2:
				System.out.print("請輸入存款金額: ");
				int amount = scanner.nextInt();
				boolean saveCheck = acct.save(amount);
				if(saveCheck) {
					System.out.println("存款成功");
				} else {
					System.out.println("存款失敗");
				}
				break;
			case 3:
				System.out.print("請輸入提款金額: ");
				int amount2 = scanner.nextInt();
				boolean withdrawCheck = acct.withdraw(amount2);
				if(withdrawCheck) {
					System.out.println("提款成功");
				} else {
					System.out.println("提款失敗");
				}
				break;
			case 4:
				System.out.print("請輸入轉帳金額: ");
				int amount3 = scanner.nextInt();
				boolean transferCheck = acct.transfer(amount3, acctT);
				if(transferCheck) {
					System.out.println("轉帳成功");
					System.out.printf("%s 轉給 %s $%d\n", acct.name, acctT.name, amount3);
				} else {
					System.out.println("轉帳失敗");
				}
				break;
			case 0:
				System.exit(1);
		}
	}
	
	void start() {
		while (true) {
			menu();
		}
	}
}
