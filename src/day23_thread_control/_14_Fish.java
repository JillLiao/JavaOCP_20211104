package day23_thread_control;

public class _14_Fish {
	private boolean bowlIsEmpty = true; // 碗的狀態

	public synchronized void eatFish(int n) { // 貓吃魚
//		if(bowlIsEmpty) {
		while (bowlIsEmpty) { // 若要搭配notifyAll()時，需使用while增加判斷次數，避免被其他程式隨意喚醒
			try {
				wait();
			} catch (Exception e) {

			}
		}
		System.out.printf("%s 吃了第 %d 隻魚\n", Thread.currentThread().getName(), n);
		bowlIsEmpty = true; // 魚被吃掉，因此碗為空
//		notify();//貓提醒主人放魚
		notifyAll();
	}

	public synchronized void putFish(int n) { // 主人放魚
//		if(!bowlIsEmpty) {
		while (!bowlIsEmpty) { // 若要搭配notifyAll()時，需使用while增加判斷次數，避免被其他程式隨意喚醒
			try {
				wait();
			} catch (Exception e) {

			}
		}
		System.out.printf("%s 放了第 %d 隻魚，\n", Thread.currentThread().getName(), n);
		bowlIsEmpty = false; // 碗已被放置魚，因此不為空
//		notify();//通知貓吃魚
		notifyAll();
	}
}
