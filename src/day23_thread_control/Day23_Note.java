package day23_thread_control;

public class Day23_Note {
/*
 * 一、執行緒的等待與喚醒	(參範例1~4)
 * 	不同執行緒之間的互動，達成設定的條件後會相互等待、相互喚醒(用主人放餅乾給狗狗的例子去想像)
 * 	1. wait()		→ 讓執行緒進入等待狀態，並且【解除鎖定】，拋出InterruptedException
 * 	2. notify()		→ 負責喚醒【一個】正處於等待狀態的執行緒並取回鎖(較少用)，但在wait pool中若有複數的執行緒時，
 * 					  是由JVM運算決定哪個執行緒被喚醒，工程師無法指定。
 * 	3. notifyAll()	→ 負責喚醒【所有】正處於等待狀態的執行緒並取回鎖(較常用)
 * 
 * 二、Deadlock 死結
 * 	當執行緒彼此鎖定資源，卻又需要取得對方資源，相互僵持不下的狀況即稱為死結。解除方法:
 * 	1. 移除synchronized
 * 		※優點: 簡單
 * 		※缺點: 風險大，因為改變了方法簽章，可能導致其他的問題。例如day_22的提款問題
 * 	2. 設置Timer
 * 		※缺點: 因為要進行Code Review來配置Timer並找出問題點，故耗時耗力。
 * 	3. 資源邊緒(resource ordering)
 * 		※優點: 為每一個物件的鎖定旗指定取得次序，因此可保證不可能有二條執行緒同時持有相同物件的鎖定旗
 * 		※缺點: 系統規劃時期就要製作一張額外的database table以供次序的排定，當系統已架設完成後才想做table就太晚了
 * 
 * 三、分離執行緒撰寫法 (參範例5~8)
 * 	主程式盡量避免接觸執行緒，java 5之後就開始去避免在 main裡面new Thread()，因為容易影響執行緒的管理
 * 		→ Executor本身為一個interface，讓裡面的方法 Execute(Runnable r)代理執行任務
 * 	※ Executor物件.execute(任務物件)		
 * 
 * 四、標準執行緒池 ThreadPoolExecutor 	 (想像成YouBike，只要車子沒人借，大家都能用)
 * 
 * 	1. Exectors.newCachedThreadPool()
 * 		ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newCachedThreadPool();  
 * 		→ 表示Runnable可能將執行在新建執行緒或重複利用的執行緒中，初始可以為0，會隨任務需求去增加執行緒數量。
 * 		※優點: 不需要排隊
 * 		※缺點: 資源耗損太快，超出系統負荷時可能導致crash
 * 			
 * 	2. Exectors.newFixedThreadPool()
 * 		ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
 * 		→ 表示會在執行緒池中建立固定數量的執行緒，並讓 Runnable(沒有回傳值) 或 Callable(有回傳值) 來運行，
 * 		  初始至少要有1，不然無法運行。
 * 		※優點: 資源不至於耗損得太快
 * 		※缺點: 可能需要排隊
 * 
 * 	3. 執行緒池的使用
 * 		※ 執行緒池物件.submit(任務物件)	→ 將任務放入池中並執行
 * 		※ 執行緒池物件.shutdown()		→ 在任務全部結束後，平滑的關閉執行緒池。若一直不關閉執行緒池，可以不斷的加入新的任務給他，
 * 									  但若任務完成後還不關閉，則會持續占用記憶體，浪費資源。
 * 		※ 執行緒池物件.shutdownNow()	→ 無論先前的任務是否完成，立刻強制關閉執行緒池。
 * 	4. 執行緒池使用狀態監控
 * 		
 * 
 * 五、其他API
 * 	1) Thread.activeCount()			→ 計算全部的執行緒數量，除了自身設計的執行緒，還會外加一條主執行緒
 * 	2) 執行緒池物件.getActiveCount()		→ 計算執行緒池正在執行任務的執行緒數量
 * 	3) TimeUnit.SECOND.sleep(int k)	→ 讓執行緒sleep 5單位(SECOND)
 * 	4) 執行緒池物件.awaitTermination(long timeout, TimeUnit.SECONDS)	→ 確認是否關閉，通常會搭配while迴圈使用，
 * 			若確認執行緒池已關閉，回傳回true，並拋出InterruptedException
 * 			@timeout	這裡放入單位時間內欲檢查的次數
 * 			@timeUnit	主要有DAYS, HOURS, MINUTES, SECONDS, MILLISECONDS, MICROSECONDS, NANOSECONDS 等7種
 * 						時間單位可供選擇
 * */
}
