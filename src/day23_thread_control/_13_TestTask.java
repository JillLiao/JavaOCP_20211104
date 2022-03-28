package day23_thread_control;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class _13_TestTask {

	public static void main(String[] args) throws InterruptedException {
		ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newCachedThreadPool();		
		
		exec.submit(new _12_LongTask());
		exec.submit(new _12_LongTask());
		exec.submit(new _11_ShorTask());
		exec.submit(new _11_ShorTask());
		exec.submit(new _12_LongTask());
		exec.submit(new _11_ShorTask());
		
		//實際執行任務的執行緒數量 , 全部執行緒數量
		System.out.println("實際執行任務的執行緒數量: "+exec.getActiveCount()+" , "
				+"全部執行緒數量: "+ Thread.activeCount());
		
		exec.shutdown();	//shutdownNow()是強制關閉的意思
		
		//偵測執行緒池狀態
		//當執行緒池還沒關閉(每秒檢查一次)
		while(!exec.awaitTermination(1, TimeUnit.SECONDS)) {
			System.out.println("執行緒池尚未關閉，所以我要繼續做....任務  "+ new Date());
		}
		System.out.println("執行緒池已關閉  "+ new Date());
	}
}
