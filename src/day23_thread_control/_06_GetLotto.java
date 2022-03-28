package day23_thread_control;

import java.util.Random;

public class _06_GetLotto implements Runnable{
	private Random r = new Random();
	
	@Override
	public void run() {
		System.out.println(r.nextInt(100));
	}
}
