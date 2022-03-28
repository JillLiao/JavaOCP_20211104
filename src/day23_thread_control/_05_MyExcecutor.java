package day23_thread_control;
//concurrent 同步(執行緒)套件
import java.util.concurrent.Executor;

public class _05_MyExcecutor implements Executor{

	@Override
	public void execute(Runnable r) {
		Thread t = new Thread(r);
		t.start();
	}
	
}
