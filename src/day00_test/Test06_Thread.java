package day00_test;

class Thread_Sample extends Thread {
	// Thread 建構子
	Thread_Sample(String n) {
		super(n);
	}

	// Thread 開始執行
	public void run() {
		String tname;
		tname = super.getName();
		for (int i = 1; i <= 1000; i++) {
			System.out.println(tname + "(" + i + ")");
		}
	}
}

public class Test06_Thread {
 public static void main(String[] args) {
	 Thread_Sample t1 = new Thread_Sample("t1");
	 Thread_Sample t2 = new Thread_Sample("t2");
     t1.start();
     t2.start();
  }
}
