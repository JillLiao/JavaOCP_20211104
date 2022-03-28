package day00_test.account;

import java.util.Scanner;

public class ATM {

	static Account john = new Account("John", 5000);
	static Account jill = new Account("Jill", 8000);
	static Account max = new Account("Max", 2000);
	static Account lisa = new Account("Lisa", 4000);
	static Account[] acc = { john, jill, max, lisa };

	public static Account checkAccount() {
		while (true) {
			System.out.print("請輸入帳戶名稱: ");
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			for (int i = 0, lens = acc.length; i < lens; i++) {
				if (acc[i].getName().equals(name)) {
					System.out.printf("登入成功! %s歡迎進入系統~\n", name);
					return acc[i];
				}
			}
			System.err.println("查無此帳號! 請重新輸入");
		}
	}

	public static void start() {

		systemLoop(checkAccount());
	}

	public static void systemLoop(Account operator) {
		while (true) {
			System.out.println("**** ATM 系統 ****");
			System.out.println("1. 查詢帳戶狀況");
			System.out.println("2. 存款");
			System.out.println("3. 提款");
			System.out.println("4. 轉帳");
			System.out.println("5. 離開");
			System.out.print("請選擇服務項目: ");
			Scanner sc = new Scanner(System.in);
			switch (sc.nextInt()) {
			case 1:// 查
				accountInfomation(operator);
				break;
			case 2:// 存
				deposit(operator);
				break;
			case 3:// 提
				withdraw(operator);
				break;
			case 4:// 轉
				try {
					transfer(operator);
				} catch (Exception e) {
					System.err.println("轉帳失敗，請重新操作。");
				}
				break;
			case 5:// 離
				System.out.println("謝謝光臨，已登出帳戶。");
				System.exit(1);
				break;
			default:
				System.err.println("錯誤! 請重新選擇服務項目!");
				break;
			}

		}

	}

	public static void accountInfomation(Account operator) {
		System.out.print("請輸入查詢帳號: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for (int i = 0, lens = acc.length; i < lens; i++) {
			if (acc[i].getName().equals(name)) {
				System.out.println(acc[i]);
			}
		}
	}

	public static void deposit(Account operator) {
		System.out.print("請輸入存款金額: ");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		if (amount > 0) {
			int balance = operator.getMoney();
			operator.setMoney(balance + amount);
			System.out.printf("已將 $%d 存入帳戶\n", amount);
		} else {
			System.err.println("存款失敗，請重新操作。");
		}
	}

	public static void withdraw(Account operator) {
		System.out.print("請輸入提款金額: ");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		if (operator.getMoney() > amount) {
			int balance = operator.getMoney() - amount;
			operator.setMoney(balance);
		} else {
			System.err.println("提款失敗，請重新操作。");
		}
	}

	public static void transfer(Account operator) throws RuntimeException {
		System.out.print("請輸入轉帳帳號: ");
		Scanner sc = new Scanner(System.in);
		String toAcc = sc.next();

		for (int i = 0, lens = acc.length; i < lens; i++) {
			if (acc[i].getName().equals(toAcc)) {
				System.out.print("請輸入轉帳金額	: ");
				int amount = sc.nextInt();

				if (operator.getMoney() > amount && amount>0) {
					int balance = operator.getMoney() - amount;
					operator.setMoney(balance);

					int toBalance = acc[i].getMoney() + amount;
					acc[i].setMoney(toBalance);
					System.out.printf("轉帳成功，已將 $%d 轉至 %s 的帳戶。\n", amount, acc[i].getName());

				} 
			}
			else {
				RuntimeException e = new RuntimeException("操作失敗");
				throw e;
			}
		}
	}
}
