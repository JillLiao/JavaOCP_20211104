package day22_thread_control;

import java.util.concurrent.CyclicBarrier;

public class _05_CarMain {

	public static void main(String[] args) {
		Runnable lunch = ()-> {
			System.out.println("吃午餐");//使用Lambda改寫，若動作有許多行，
			System.out.println("吃水果");//可以用{}將所有動作框起來
			};	
			
		int parties = 2;	//4個執行緒一組
		CyclicBarrier cyclicBarrier = new CyclicBarrier(parties, lunch);//意思是滿足循環屏障後才能吃午餐
		
		Thread t1 = new Thread(new _04_Car(cyclicBarrier),"A車");
		Thread t2 = new Thread(new _04_Car(cyclicBarrier),"B車");
		Thread t3 = new Thread(new _04_Car(cyclicBarrier),"C車");
		Thread t4 = new Thread(new _04_Car(cyclicBarrier),"D車");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
//		new Thread(new _04_Car(cyclicBarrier),"E車").start();
	}

}
//-------------- 如果配合用 extends Thread 改寫... ----------------------------------------------------

//public class _05_CarMain {
//
//	public static void main(String[] args) {
//		Runnable lunch = ()-> {
//			System.out.println("吃午餐");//使用Lambda改寫，若動作有許多行，
//			System.out.println("吃水果");//可以用{}將所有動作框起來
//			};
//
//		int parties = 4;	//4個執行緒一組
//		CyclicBarrier cyclicBarrier = new CyclicBarrier(parties);
//		
//		_04_Car t1 = new _04_Car(cyclicBarrier,"A車");
//		_04_Car t2 =new _04_Car(cyclicBarrier,"B車");
//		_04_Car t3 =new _04_Car(cyclicBarrier,"C車");
//		_04_Car t4 =new _04_Car(cyclicBarrier,"D車");
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();		
//	}
//}	
