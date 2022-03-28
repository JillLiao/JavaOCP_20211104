package day21_thread;

public class _04_Walk implements Runnable{
	private void move() {
		String tName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 走了 %d 公尺\n", tName, i);
		}
	}

	@Override
	public void run() {
		move();
	}
}
