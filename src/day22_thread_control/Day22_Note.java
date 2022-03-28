package day22_thread_control;

public class Day22_Note {
/*Topic: 執行緒的控制
 * 一、何為執行緒 (Thread)? 以及如何應用?
 * 	1. 要建立執行緒，須【extends Thread】 或 【implement Runnable (此寫法較佳)】
 * 	2. 執行緒還包含：主執行緒(main)、子執行緒(sub-thread)，子執行緒又可稱為工作執行緒(worker thread)。
 *  3. 電腦執行程式時可以  (1)單工  (2)多工  (3)多緒(分時多工)  →　便當理論
 *  4. 執行緒係指行程(process)中的程式片段
 *  5. 子執行緒可以分為：【User執行緒】 以及 【背景執行緒】
 *  	※User Thread: 執行主要任務的執行緒，main執行緒一定會等待User執行緒結束後才會關閉程式/系統。
 * 		※Daemon Thread: 即便工作沒有完成，只要User執行緒結束了，main就會關閉程式，不會等待背景執行緒。
 * 			不太重要的工作才會放在背景執行緒，例如:預先載入但不見得之後會去做的資訊。但使用上要小心，否則會占用到User執行緒的資源。
 *  6. 想要使用執行緒，須按照下述步驟:
 *  	(1) 建立任務的靜態Class並【extends Thread】
 *  	(2) 將欲執行的任務放在run()裡面
 *  	(3) 在Main裡面建立任務物件 (此時任務物件已經是Tread物件了)
 *  	(4) 任務物件.start()執行任務
 *  	※若要像Runnable那樣命名執行緒的話，需要變更建構子、或Main中使用setName()
 *  
 *  	--------Runnable是interface，所以在Main中無法直接建立出實體，故步驟有一點點不一樣-----------
 *  
 *  	(1) 建立任務的靜態Class並【implement Runnable】
 *  	(2) 將欲執行的任務放在run()裡面
 *  	(3) 在Main裡面建立任務物件
 *  	(4) 在Main中接著建立Tread物件，同時將【任務物件】、【任務名】放入Thread物件的參數中
 *  			或將3、4點結合 → Thread t1 = new Thread(new Mission(), "ThredName")
 *  	(5) Thread物件.start()執行任務
 *  7. 執行緒常用方法:
 *  	.setName("執行緒名稱")	→ 設定執行緒名稱
 *  	.setPriority()		→ 設定權限(1~10)或 MIN_PRIORITY、NORM_PRIORITY、MAX_PRIORITY
 * 		Thread.currentThread().getName()	→ 得到正在執行的執行緒名稱
 * 		.setDaemon(true)	→ 設為背景執行緒
 * 		Thread.sleep(毫秒)	→ 請本執行緒在設定的時間內等待，並拋出 InterruptedException，參數單位是毫秒
 * 		指定執行緒物件.join(毫秒)	→ 暫停本執行緒，直到指定執行緒完畢為止; 或輸入參數(毫秒)設定最長等待時間
 * 		循環屏障物件.await()	→ 等待其他執行緒，並拋出BrokenBarrierException
 * 		wait()				→ 配合notify()、notifyAll()，讓執行緒進入等待狀態，並且【解除鎖定】，拋出InterruptedException
 * 		notify()			→ 負責喚醒【一個】正處於等待狀態的執行緒並取回鎖(較少用)，但在wait pool中若有複數的執行緒時，
 * 							  是由JVM運算決定哪個執行緒被喚醒，工程師無法指定。
 * 		notifyAll()			→ 負責喚醒【所有】正處於等待狀態的執行緒並取回鎖(較常用)
 * 
 * 8. CyclicBarrier(int parties, Runnable barrierAction)  循環屏障
 * 		讓一組執行緒等待至某個狀態之後再全部同時執行。	→ 用結伴同行去想像
 * 		實際應用: 匯聚了必要的data後即可進行成本的計算彙總
 * 		@parties 每組有幾個執行緒，此參數必須填寫
 * 		@barrierAction 當滿足屏障條件後要進行什麼動作，可以用Lambda寫法較為省事，
 * 			本參數可以為null，不寫就沒有特別的動作
 * 
 * 二、執行緒環境資源鎖定	//參範例day22_6~8
 * 	1. 資源的鎖定要先談到資源共享，所謂資源共享就是大家都看得到，但不一定碰的到
 * 	2. 而資源鎖定可以使用 synchronized，就是每次只允許一個執行緒進入碰觸這項資源，且在資源被釋放前，其他執行緒不得存取
 * 		※鎖定方法 		→ synchronized
 * 		  鎖定屬性(變數)	→ volatile 。但限定用於 long、double，在大數據分析時比較容易使用到，
 * 				避免計算完的資料要傳回主記憶體時，卻被其他的程式取得回傳前的值。例: volatile long x = 100;
 * 				但也因為可以針對屬性進行鎖定，所以控制執行緒的變數盡量不要使用long、double，例如day23範例中使用的為boolean
 * 	3. 雖然synchronized可以避免因執行緒相互爭搶資源造成的混亂，但同時因為鎖定資源之故，使得整個執行緒變成單工，整體運行效率會降低，所以請小心使用
 * 	4. synchronized的用法:
 * 		(1) 加在方法前面，讓整個方法都被保護。例: public synchronized void getName(){}
 * 		(2) 保護方法中的部分程式碼，雖然這樣可以提高執行效率，但不好維護、易混淆，因此實務上仍建議直接將整個方法保護起來。
 * 			例:  synchronized(this){ 方法的程式碼 }
 * 		    ※ this 表示 synchronized 鎖定的是 由本class建立出來的 【物件】，即便是加在方法前面，也是鎖定【物件】
 * 三、其他
 * 	1. instance method = 物件方法
 * 	2. static method = 類別方法
 * 
 * */		
}
