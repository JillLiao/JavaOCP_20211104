package day21_thread;
/*
 * 小明、小華這二條執行緒同時執行run()方法, 試問誰先第一個取到 777 ?
   透過亂數若取到 777 則該執行緒程式停止
   若沒取到則需要再取亂數

 * */
public class _07_LuckyNumber implements Runnable {	
	private int luckyNumber = 777;

	public _07_LuckyNumber() {

	}

	public _07_LuckyNumber(int luckyNumber) {
		this.luckyNumber = luckyNumber;
	}

	@Override
	public void run() {
		
		for(int i = 1;;i++) {
			int x = (int) (Math.random() * 1000);			
			if (x == luckyNumber) {
				System.err.printf("%s 共取了 %d 次才得到 %d\n", Thread.currentThread().getName(), i, luckyNumber);
				break;
			}
			System.out.printf("%s 在第 %d 次取得號碼 %d\n", Thread.currentThread().getName(), i, x);
		}
		//若要讓2條執行緒有不同顏色以更好區分，請google關鍵字: Java console color Ascii
	}
}
