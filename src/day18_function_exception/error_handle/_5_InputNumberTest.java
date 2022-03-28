package day18_function_exception.error_handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _5_InputNumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入半徑: ");
		int r = 0;
		
		try {
			r = sc.nextInt();
		} catch (InputMismatchException e) {	//若這裡的錯誤種類直接用最上層的Exception，就代表無論何種錯誤都會採用這個處理方案
			System.err.println("輸入不正確");		//會變得無法對症下藥
			System.err.println(e);
		}
		
		double area = Math.pow(r, 2) * Math.PI;
		
		System.out.printf("半徑: %d 圓面積: %.1f\n", r, area);
	}
}
//【執行錯誤的資訊】在閱讀時，寫在愈上方的訊息，代表愈接近錯誤案發現場，但通常我們能處理或我們自己編寫的程式錯誤都集中在下方，因此建議可以從下方往上閱讀


