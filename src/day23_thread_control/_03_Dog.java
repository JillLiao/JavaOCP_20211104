package day23_thread_control;

public class _03_Dog implements Runnable{
	private _01_Cookie cookie;
	
	public _03_Dog(_01_Cookie cookie) {
		this.cookie = cookie;
	}
	
	@Override
	public void run() {
		//狗狗最多可以吃10塊餅乾
		for(int i =1; i<=10; i++) {
			cookie.eatCookie(i);
		}
	}

}
