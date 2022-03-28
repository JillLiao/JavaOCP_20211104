package day21_thread;

public class _05_BikeWalk_Main {

	public static void main(String[] args) {
		// 建立任務
		_04_Walk walk = new _04_Walk();
		_03_Bike bike = new _03_Bike();
		_06_Music music = new _06_Music();
		
		Thread t1 = new Thread(walk, "小明");		//Thread()可多載，參數除了可以帶入(任務)外，也可以帶入(任務, 任務名稱)
		Thread t2 = new Thread(bike, "小英");
		Thread t3 = new Thread(music, "音樂");
		
		t3.setDaemon(true); // 將t3設定為背景執行緒，只要前面的User Thread結束，Main Thread便會關閉，不會等待Daemon Thread

		t1.start();
		t2.start();
		t3.start();
	}

}
