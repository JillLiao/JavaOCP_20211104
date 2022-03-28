package day21_thread;

public class _06_Music implements Runnable{
	@Override
	public void run() {
		play();
	}

	private void play() {
		String tName = Thread.currentThread().getName();
		for (int i = 1;; i++) {
			System.out.printf("%s 播放 %d 秒\n", tName, i);
		}
	}
}
