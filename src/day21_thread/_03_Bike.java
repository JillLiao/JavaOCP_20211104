package day21_thread;

public class _03_Bike implements Runnable{
	private void ride() {
		String tName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 騎了 %d 公里\n", tName, i);
		}
	}

	@Override
	public void run() {
		ride();
	}
}
