package day23_thread_control;

import java.util.Random;

public class _09_GetLotto implements Runnable{
	private Random r = new Random();
	
	@Override
	public void run() {
		//模擬搖奬時間
		try {
			Thread.sleep(r.nextInt(1));
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		//印出獎號
		System.out.println(r.nextInt(100));
	}

}
