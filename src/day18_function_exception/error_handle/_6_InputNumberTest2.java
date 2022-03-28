package day18_function_exception.error_handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _6_InputNumberTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入半徑: ");
		try {
			
			int r = sc.nextInt();
			double area = Math.pow(r, 2) * Math.PI;	//明明輸入不正確，卻能跑出0這個結果，顯然不合理，因此也可以將
			System.out.printf("半徑: %d 圓面積: %.1f\n", r, area);	//程式主體放在try裡保護，確保程式可以在完全正確的狀況運行

		} catch (InputMismatchException e) {
			System.err.println("輸入不正確");
			System.err.println(e);
		}
	}
}
