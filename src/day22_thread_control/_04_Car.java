package day22_thread_control;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

//主題:CyclicBarrier循環屏障
public class _04_Car implements Runnable{
	private CyclicBarrier cyclicBarrier;
	public _04_Car (CyclicBarrier cyclicBarrier){
		this.cyclicBarrier = cyclicBarrier;
	}
	
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 從桃園出發\n", tName);
		
		try {
			Thread.sleep(new Random().nextInt(10000));	//拋出InterruptedException
			System.out.printf("%s 到台中了\n", tName);
			cyclicBarrier.await();	//等待其他執行緒 → 會拋出BrokenBarrierException
		} catch (Exception e) {
			System.out.printf("%s發生意外: %s\n",tName,e);
			return;	//方法提前結束
		} 
		
		System.out.printf("%s 往高雄出發\n", tName);
	}
	
}
//----------- 如果用 extends Thread 改寫... ------------------------------------------------

//public class _04_Car extends Thread{
//	private CyclicBarrier cyclicBarrier;
//	private String tName;
//	
//	public _04_Car(CyclicBarrier cyclicBarrier, String tName){
//		this.cyclicBarrier = cyclicBarrier;
//		this.tName = tName;
//	}
//	
//	public void run() {
//		System.out.printf("%s 從桃園出發\n", tName);
//		
//		try {
//			Thread.sleep(new Random().nextInt(10000));
//			System.out.printf("%s 到台中了\n", tName);
//			cyclicBarrier.await();	//等待其他執行緒 → 會拋出BrokenBarrierException
//		} catch (Exception e) {
//			System.out.printf("%s發生意外: %s\n",tName,e);
//			return;	//方法提前結束
//		} 
//		
//		System.out.printf("%s 往高雄出發\n", tName);
//	}	
//}
