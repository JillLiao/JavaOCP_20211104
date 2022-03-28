package day19_exception_web_crawler;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _2_InputNumberTest5 {

	public static void main(String[] args) {
		int num = 10; // 分子
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分母:");
		
		try {
			int de = sc.nextInt();
			int result = num / de;
			if(de == 0) {
				System.out.println("if-else判斷檢核：分母不可=0");	//雖然ArthmeticException可以用try-catch捕捉
			} else {											//但若能用判斷式取代的話，catch能少用就少用
				System.out.println(result);
			}
		} catch (InputMismatchException e) {	//此錯誤的意思是：「輸入的資料」型別與預設的不一樣
			System.out.println("輸入錯誤");
		}
		//1.try-catch雖然好用，但因為他是結構性的檢核機制，內部程式的狀態會被記錄，因此執行效率必然會【比單純的if-else或相關判斷式慢】
		//	大部分的RuntimeException都是【非受檢例外】(Unchecked Exception)，這種例外不需要特地使用try-catch捕捉，
		//	幾乎都能藉由判斷式來替代緩慢的try-catch，提高執行效率。
		//2.不需要特地使用try-catch去檢核的例外即稱為【非受檢例外】
		//3.能被判斷式替代的Exception,例如: NullPointerException、ArthmeticException、ArrayIndexOutOfBoundsException
		//4.程式中的RuntimeException Java的編譯器不會去檢查，甚至在拋出例外時不在方法簽章中定義，也不會產生錯誤，
		//	因此我們不會特地去創造RuntimeException，因為是無意義的行為。
		//5.Java的RuntimeException存在的目的是為了告知工程師，程式或系統某些地方邏輯驗證仍不完善、有漏洞。因此RuntimeException
		//	根本就不該被捕捉，而是應該要將它視為一種補強程式的提醒
		//6.Error也屬於非受檢例外，不是用來try-catch的，根本無法處理，而且也不該是軟體工程師去處理。Error發生時，可能是系統本身發出的警示，
		//	或硬體設備有異常，例如：電腦記憶體不足、JRE有異常、JVM有問題....本來就不該在這種狀態下繼續讓程式運行，所以對Error進行錯誤處理沒有意義。
		//7.倒也不是所有的RuntimeException都非要用判斷式取代try-catch，因為有時候取代的判斷式非常複雜，反而會花太多時間去撰寫判斷式，
		//	例如InputMismatchException真的要用判斷式寫起來的話，會變成【_3_InputNumberTest6】檔案中這樣，而且這個判斷式還不算完善，
		//	無法判斷負數、小數，那還不如一開始就用try-catch省事一些
	}

}
