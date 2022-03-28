package day24_thread_scheduled_fork_join;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class _05_ForkJoinFibonacci extends RecursiveTask<Long>{	//RecursiveTask 表示有返回值的任務
	private static final long THRESHOLD = 20;	//這裡的THRESHOLD值是表示，在Fibonacci項數小於等於此數值時，【傳統計算法】與
	private Long number;						//【Fork/Join法】在運算效率上無明顯區別，每台電腦這邊的閾值都不同，可以自行先去測試
	
	public _05_ForkJoinFibonacci(Long number) {
		this.number = number;
	}
	
	public Long getNumber() {
		return number;
	}
	
	@Override
	protected Long compute() {
		long n = number;
		if(n < THRESHOLD) { // 若小於門檻值則進行傳統解法
			number = fib(n);
		} else {
			_05_ForkJoinFibonacci f1 = new _05_ForkJoinFibonacci(n-1);
			_05_ForkJoinFibonacci f2 = new _05_ForkJoinFibonacci(n-2);
			ForkJoinTask.invokeAll(f1, f2);
			number = f1.number + f2.number;
		}
		return number;
	}

	//---------------------------------------------------------
	
	// 傳統解法
	private static long fib(long n) {
		/*
		if(n < 2) 
			return n;
		else
			return fib(n-1) + fib(n-2);
		*/
		return (n < 2) ? n : fib(n-1) + fib(n-2);
	}
	
	// 主程式
	public static void main(String[] args) {
		long n = 50; 
		int processors = 4; // 核心數
		System.out.printf("【Fork/Join解法】\n");
		System.out.printf("開始時間: %s\n", new Date());	//先印出開始時間
		_05_ForkJoinFibonacci task = new _05_ForkJoinFibonacci(n);
		new ForkJoinPool(processors).invoke(task);	//invoke 相當於
		System.out.printf("第 %d 項 = %d\n", n, task.getNumber());
		System.out.printf("結束時間: %s\n", new Date());
		
		System.out.println("---------------");
		
		System.out.printf("【傳統解法】\n"); 
		System.out.printf("開始時間: %s\n", new Date());
		System.out.printf("第 %d 項 = %d\n", n, fib(n));
		System.out.printf("結束時間: %s\n", new Date());
		
	}
}