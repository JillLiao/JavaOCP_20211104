package day21_thread;

public class _01_Race extends Thread{
	
	public _01_Race(String tName) {	//將建構子先設定好的話，之後建立執行緒時就可以直接設定名字了，不用再額外setName
		super(tName);
	}

	private void job() {	
		String tName = Thread.currentThread().getName();	//或 String tName = super.getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 跑了 %d 步\n", tName, i);
		}
	}

	@Override
	public void run() {
		job();
	}
}
