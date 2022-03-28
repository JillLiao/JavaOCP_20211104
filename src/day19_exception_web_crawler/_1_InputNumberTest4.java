package day19_exception_web_crawler;

import java.util.Scanner;

public class _1_InputNumberTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 10; // 分子
		System.out.print("請輸入分母:");
		int de = sc.nextInt();
		calc1(num, de);
		
		try {
			calc2(num, de);				//由於calc2會拋出我們自訂的Exception，因此在main呼叫calc2時
		} catch (Exception e) {			//會被強制套上try-catch，否則產生編譯錯誤
			System.err.println(e);
		}
	}
	
	// 計算結果 1
	public static void calc1(int num, int de) {
		try {
			int result = num / de;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.err.println("公版例外--數學錯誤:" + e);
		}
	}
	
	// 計算結果 2
	public static void calc2(int num, int de) throws Exception {	//必須在方法簽章處要定義並告知電腦，之後可能會拋出例外
		if(de == 0) { // 分母若 == 0
			Exception e = new Exception("自訂例外--分母不可=0"); // 自行建立一個例外物件，Line 35拋出了例外，因此要回到Line 32補充說明
			throw e;
		}
		int result = num / de;
		System.out.println(result);
	}

}
