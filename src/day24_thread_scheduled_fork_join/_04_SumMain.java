package day24_thread_scheduled_fork_join;

import java.util.concurrent.ForkJoinPool;

public class _04_SumMain {
	public static void main(String[] args) {
		ForkJoinPool fjPool = new ForkJoinPool();
		int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		fjPool.invoke(new _03_Sum(data, 0, data.length));
	}
}
