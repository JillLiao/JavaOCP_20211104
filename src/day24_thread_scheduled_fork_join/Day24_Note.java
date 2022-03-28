package day24_thread_scheduled_fork_join;

public class Day24_Note {
/*
 * 一、排程化執行續池	ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor()
 * 	實務上排程化常用於延遲某項功能、列表、快照、報表...等，而在等待時間內進行一些準備工作
 * 	1. 單次排程化處理	→ service.schedule(Runnable command, long delay, TimeUnie unit)
 * 						@command	任務內容，可先用Runnable r = ()->{...任務...}  Lambda先定義好，再放到參數裡
 * 						@delay		預計要延遲多少個時間單位
 * 						@unit		時間單位，可以用TimeUnit 的 Enum 去定義
 * 	2. 重複性排程化處理	→ 進行週期性的動作，例如:冷凍庫溫度顯示、加油站油錶金額的跳動、股票報價。常見的有下列二種:
 * 		(1) scheduleWithFixedDelay()	無論機器工作、反應時間多長，中間的delay時間都是固定的
 * 		(2) scheduleAtFixedRate()		此方法會將機器的工作、反應時間計入delay的時間，若機器反應時間過長，
 * 										反應一結束就不會延遲並立刻執行排程任務，同時多餘的反應時間會被記入下一次的延遲週期。
 * 										簡單的說就是在上一次工作完成時間與基本週期時間之間取較大的當成下一次工作的起點時間。
 * 二、Fork/Join
 * 	Fork：將任務不斷向下分解(Fork)至最小單位，程式將計算此最小單位的邏輯結果
 * 	Join ：得到結果後再往上合併(Join)計算至源頭，到了源頭答案也就出來了
 * 	
 * 	※使用方法:
 * 	1. 如同執行緒，Fork/Join也需要先建立任務class，不一樣的是，執行緒的任務class要implement Runnable 或 extends Thread; 
 * 		而 ForkJoinPool的任務class必須依據任務性質去extends下面其中一種抽象類別:
 * 		1) RecursiveTask <V>: 用於【有】返回值的任務，而<>中的泛型型別也代表了回傳值的data type
 * 		2) RecursiveAction: 用於【沒有】返回值的任務
 * 	2. 在Fork/Join的任務class中設定一個 (private) static final 性質的 THRESHOLD (閾值/門檻值)，用於定義本程式運算的最小邏輯單位，
 * 		任務負荷的數值超過此邏輯單位時，任務會被不斷的拆解。
 * 	3. 無論本任務class繼承的是 RecursiveTask 或 RecursiveAction，都會被強制實作(override) compute()方法，
 * 		本程式的運算邏輯就在此方法內撰寫
 * 
 * 
 * 	ForkJoinPool fj = new ForkJoinPool(int 使用的核心數量);
 * 	ForkJoinPool物件.invoke(任務物件);		→這裡的invoke相當於Thread中的start
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
}
