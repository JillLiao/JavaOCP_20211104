package day23_thread_control;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class _10_ThreadPoolExecutorDemo {

	public static void main(String[] args) {
		//建立執行緒池
//		ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		
		for(int i=1; i<=100;i++) {	//執行100個任務，但實際上從結果看來並沒有用到101條執行緒，因為任務結束後
			exec.submit(new _09_GetLotto());	//會將執行緒空出來給其他任務使用
		}
		
		System.out.printf("使用執行緒數量: %d\n",Thread.activeCount());
		exec.shutdown();
	}

}
