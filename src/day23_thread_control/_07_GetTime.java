package day23_thread_control;

import java.util.Date;

public class _07_GetTime implements Runnable{
	
	@Override
	public void run() {
		System.out.println(new Date());
	}
}
