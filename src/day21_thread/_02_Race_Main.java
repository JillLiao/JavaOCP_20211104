package day21_thread;

public class _02_Race_Main {

	public static void main(String[] args) {
		_01_Race r1 = new _01_Race("烏龜");	//
		_01_Race r2 = new _01_Race("兔子");
//		r1.setName("烏龜"); // 設定執行緒名稱
//		r2.setName("兔子");
		// 執行緒權限 1~10 數字越大被調用到的機率越多次
		// 權限預設都為5
		r1.setPriority(Thread.MAX_PRIORITY); // 10	//setPriority()的參數除了呼叫常數以外，也可以直接輸入數字進行權限微調
		r2.setPriority(Thread.MIN_PRIORITY); // 1	//常數只有 MIN_PRIORITY、NORM_PRIORITY、MAX_PRIORITY 三種
		System.out.println(r1.getPriority());	//查詢執行緒目前權限設定
		System.out.println(r2.getPriority());
		//r1.job();	//直接呼叫job()工作最後會變成Main在做。若不使用執行緒，萬一r1產生了狀況，以至於無法完成工作，r2就會連執行的機會都沒有了
		//r2.job();
		r1.start();	//如果這裡寫成r1.run()就會變成Main在做事情，失去了執行緒的意義
		r2.start();	//即便是呼叫start()，scheduler會自己去抓執行緒去執行run裡面的任務
	}

}
