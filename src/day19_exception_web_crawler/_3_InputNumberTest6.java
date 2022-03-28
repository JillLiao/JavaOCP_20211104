package day19_exception_web_crawler;

import java.util.Scanner;

public class _3_InputNumberTest6 {

	public static void main(String[] args) {
		// 如何判斷是數字 ?
		System.out.println(Character.isDigit('1'));	//Character.isDigit()可用於判斷該字元是否為數字，回傳布林值
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('巨'));

		System.out.println("------------");
		// 字串 "1234"; 是否是數字 ?
		String num = "1234";
		System.out.println(checkNumber(num));
		String num2 = "12a34";
		System.out.println(checkNumber(num2));

		Scanner sc = new Scanner(System.in);
		int num3 = 10; // 分子
		System.out.print("請輸入正整數分母:");
		String str = sc.next();
		if (checkNumber(str)) {
			int de = Integer.parseInt(str);
			if (de == 0) {
				System.out.println("分母不可 = 0");
			} else {
				int result = num3 / de;
				System.out.println(result);
			}
		} else {
			System.out.println("您輸入的不是數字");
		}

	}

	private static boolean checkNumber(String num) {
		for (int i = 0; i < num.length(); i++) {
			if (!Character.isDigit(num.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
