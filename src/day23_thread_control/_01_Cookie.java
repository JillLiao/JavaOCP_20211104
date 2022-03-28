package day23_thread_control;

public class _01_Cookie {
	private boolean dishIsEmpty = true;	//盤子的狀態
	
	public synchronized void eatCookie(int n) {	//狗狗吃餅乾
//		if(dishIsEmpty) {
		while(dishIsEmpty){		//若要搭配notifyAll()時，需使用while增加判斷次數，避免被其他程式隨意喚醒
			try {
				wait();
			} catch (Exception e) {
				
			}
		}
		System.out.printf("%s 吃了第 %d 塊餅乾\n",Thread.currentThread().getName(), n);
		dishIsEmpty = true;	//餅乾被吃掉，因此盤子為空
//		notify();//狗狗提醒主人放餅乾
		notifyAll();
	}
	
	public synchronized void putCookie(int n) {	//主人放餅乾
//		if(!dishIsEmpty) {
		while(!dishIsEmpty){		//若要搭配notifyAll()時，需使用while增加判斷次數，避免被其他程式隨意喚醒
			try {
				wait();
			} catch (Exception e) {
				
			}
		}
		System.out.printf("%s 放了第 %d 塊餅乾，\n",Thread.currentThread().getName(), n);
		dishIsEmpty = false;	//盤子已被放置餅乾，因此不為空
//		notify();//通知狗狗吃餅乾
		notifyAll();
	}
}
