package day00_test.account;

import java.util.Arrays;
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
				transfer(operator);				
				break;
			case 5:// 離
				System.out.println("謝謝光臨，已登出帳戶。");
				System.exit(0);	//exit(int status): status 可為0或任意非0值，雖然無論如何都可以關閉JVM，但意思不一樣。
				break;				//exit(0)表示正常關閉JVM，exit(1)表示異常關閉，通常會放在catch區塊。
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
		Account searchAccount = new Account();
		
//		↓↓↓↓ java 8 的串流寫法
//		Arrays.stream(acc).filter(a -> a.getName().equals(name))
//			.forEach(a-> System.out.println(a));
//		↓↓↓↓ java 7 以前的舊方法 ↓↓↓↓
		for (int i = 0, lens = acc.length; i < lens; i++) {
			if (acc[i].getName().equals(name)) {
				System.out.println(acc[i]);
				searchAccount = acc[i];
			}
		}
		if(searchAccount.getName() == null) {
			System.err.println("查無此人，請重新操作!");
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

	public static void transfer(Account operator) {
		System.out.print("請輸入轉帳帳號: ");
		Scanner sc = new Scanner(System.in);
		String toAcc = sc.next();
		Account tAc= new Account();		
		
		for (int i = 0, lens = acc.length; i < lens; i++) {
			if (acc[i].getName().equals(toAcc)) {
				tAc= acc[i];				
			}
		}
		if(tAc.getName() != null) {	
			System.out.print("請輸入轉帳金額: ");
			int amount = sc.nextInt();
			if (operator.getMoney() > amount && amount>0) {
				int balance = operator.getMoney() - amount;
				operator.setMoney(balance);

				int toBalance = tAc.getMoney() + amount;
				tAc.setMoney(toBalance);
				System.out.printf("轉帳成功，已將 $%d 轉至 %s 的帳戶。\n", amount, tAc.getName());
			}else {
				System.err.println("輸入金額錯誤，請重新操作!");
			}
		}else {
			System.err.println("查無此帳戶，請重新操作!");
		}
		
	}	
}
