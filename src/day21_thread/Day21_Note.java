package day21_thread;

public class Day21_Note {
/*
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
 *  	setName("執行緒名稱")	→ 設定執行緒名稱
 *  	setPriority()		→ 設定權限(1~10)或 Thread.MIN_PRIORITY、Thread.NORM_PRIORITY、Thread.MAX_PRIORITY
 * 		Thread.currentThread().getName()	→ 得到正在執行的執行緒名稱
 * 		setDaemon(true)		→ 設為背景執行緒
 * */		
}
