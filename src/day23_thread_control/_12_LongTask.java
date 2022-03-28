package day23_thread_control;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class _12_LongTask implements Runnable{
	Random r = new Random();
	@Override
	public void run() {
		System.out.println("長任務--開始");
		try {
			TimeUnit.SECONDS.sleep(r.nextInt(5)+1);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("長任務--結束");
	}

}
