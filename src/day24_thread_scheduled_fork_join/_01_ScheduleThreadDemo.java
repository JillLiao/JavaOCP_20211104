package day24_thread_scheduled_fork_join;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class _01_ScheduleThreadDemo {
	public static void main(String[] args) {
		Runnable r =() -> System.out.println(new Date());
		System.out.println("等10秒後跑出現在時間");
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.schedule(r, 10, TimeUnit.SECONDS);
		service.shutdown();
		
	}
}
