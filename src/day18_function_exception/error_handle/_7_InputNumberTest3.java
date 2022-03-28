package day18_function_exception.error_handle;

import java.util.Arrays;
import java.util.Scanner;

public class _7_InputNumberTest3 {

	public static void main(String[] args) {
		int[] y = {1, 10, 0, 5}; // 分母陣列
		System.out.printf("請選擇分母 %s 輸入 index = ", Arrays.toString(y));
		Scanner sc = new Scanner(System.in);
		// 計算
		int x = 100; // 分子
		try {
			int idx = sc.nextInt();
			int de = y[idx]; // 分母
			int result = x / de;
			System.out.printf("%d / %d = %d \n", x, de, result);
		} catch (ArithmeticException e) {					//像這樣連續抓取錯誤的結構，若下方catch的錯誤與上方有繼承關係時，
			System.err.printf("有數學錯誤發生, 錯誤原因: %s\n", e.getMessage());	//要先寫子類別(上) 再寫父類別(下)
		} catch (ArrayIndexOutOfBoundsException e) {						//錯誤包含範圍小	錯誤包含範圍大
			System.err.printf("有陣列錯誤發生, 錯誤原因: %s\n", e.getMessage());
		} finally {
			System.out.println("謝謝使用!");					//無論是否有錯誤發生都必須要執行的程式，就放在finally裡面
		}
		//catch - try - finally
		//共同好友 - 摯友 - 共同好友
	}
}
