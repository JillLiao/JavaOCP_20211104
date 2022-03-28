package day22_thread_control;

public class _01_Father extends Thread{
	@Override
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸準備洗澡");
		System.out.println("爸爸發現沒瓦斯");
		System.out.println("爸爸請工人送瓦斯");
		
		_02_Worker worker = new _02_Worker(); // 建立工人執行緒
		System.out.println("爸爸等待工人送瓦斯...");
		worker.start(); // 工人執行送瓦斯的行為
		
		try {
			worker.join(5000);	
			//使用 執行緒物件.join() 可指定由哪個執行緒一同參與任務，
			//當前的執行緒會被暫停，等指定的執行緒執行完成後，再接著執行。
			//若不想等太久，可用參數設定最常等待時間
			//5000表示本執行緒最多等worker執行緒5秒
		} catch (InterruptedException e) {
			System.out.println("意外發生:" + e);
			return;	//發生例外時，程式結束
		}
		Thread.yield();
		System.out.println("工人將瓦斯裝好");
		System.out.println("爸爸開始洗澡");
		System.out.println("爸爸洗完澡了");
		
	}
}
