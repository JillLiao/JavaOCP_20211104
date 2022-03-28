package day00_test;

class Runnable_Sample implements Runnable{
	// Thread 建構子
	Runnable_Sample(String n) {
		
	}
	 
	    //Thread 開始執行
	public void run( ) {
			String tname;
			tname = Thread.currentThread().getName();
			for(int i = 1; i<=1000;i++) {
				System.out.println(tname+"("+i+")");
			}
		}
	}

public class Test07_Runnable {
	public static void main(String[] args) {
		Runnable_Sample tt1 = new Runnable_Sample("thread1");
		Runnable_Sample tt2 = new Runnable_Sample("thread2");
		Thread t1 = new Thread(tt1);     
		Thread t2 = new Thread(tt2);  
		t1.start();
		t2.start();

	}
}
