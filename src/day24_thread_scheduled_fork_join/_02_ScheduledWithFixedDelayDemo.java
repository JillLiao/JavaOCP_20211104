package day24_thread_scheduled_fork_join;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Danger extends Thread {
	private int temp;
	Danger(int temp) {
		this.temp = temp;
	}
	public void run() {
		System.err.println(temp + "度, 溫度過高發簡訊通知 ....");
	}
}

public class _02_ScheduledWithFixedDelayDemo {

	public static void main(String[] args) {
		Random random = new Random();
		Runnable r = () -> {
			System.out.printf("開始作業: %s\n", new Date());
			int delayTime = random.nextInt(2000);	//模擬機械工作時間，採集溫度的時間最長為2秒
			try {
				Thread.sleep(delayTime);
			} catch (Exception e) {
				
			}
			int temp = random.nextInt(10);
			System.out.printf("結束作業: %s, %d 度, delayTime:%d\n", new Date(), temp, delayTime);
			if(temp > 5) {	//冰箱溫度超過5度時發出警報
				new Danger(temp).start();
			}
		};
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		int initTime = 1; // 初始時間(進行第一個週期前的緩衝時間)
		int fixedTime = 5; // 設定週期時間 
//		service.scheduleWithFixedDelay(r, initTime, fixedTime, TimeUnit.SECONDS);
		service.scheduleAtFixedRate(r, initTime, fixedTime, TimeUnit.SECONDS);
		
	}

}
