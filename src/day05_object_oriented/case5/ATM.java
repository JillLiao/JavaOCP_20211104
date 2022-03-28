package day05_object_oriented.case5;

import java.util.Scanner;

public class ATM {
		Account acct; // 帳戶(插卡)
		Account toAcct; //轉帳帳戶
		ATM(Account acct) {
			this.acct = acct;
		}
	
		void menu() {
			System.out.println("------------");
			System.out.println("1. 查詢帳戶");
			System.out.println("2. 存款");
			System.out.println("3. 提款");
			System.out.println("4. 轉帳");
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
				if (saveCheck) {
					System.out.println("存款成功");
				} else {
					System.out.println("存款失敗");
				}
				break;
			case 3:
				System.out.print("請輸入提款金額: ");
				int amount2 = scanner.nextInt();
				boolean withdrawCheck = acct.withdraw(amount2);
				if (withdrawCheck) {
					System.out.println("提款成功");
				} else {
					System.out.println("提款失敗");
				}
				break;
			case 4:
				System.out.print("請輸入轉帳帳戶名:");
				String toTrans = scanner.next();
				if(toAcct.name==toTrans) {
					System.out.print("請輸入轉帳金額:");
					int amount3 = scanner.nextInt();
					boolean TransferCheck = acct.transfer(amount3, toAcct);
					if (TransferCheck) {
						System.out.println("轉帳成功");
					} else {
						System.out.println("轉帳失敗");
					}
					break;
				}else {
					System.out.println("查無此帳戶");
				}
								
			case 0:
				System.exit(1);	//1是狀態碼，也可以放0
			}
		}
	
		void start() {
			while (true) {
				menu();
			}
		}
}
