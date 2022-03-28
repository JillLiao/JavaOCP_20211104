package day23_thread_control;

public class _02_Master implements Runnable{
	private _01_Cookie cookie;
	
	public _02_Master(_01_Cookie cookie) {
		this.cookie = cookie;
	}
	
	@Override
	public void run() {
		//主人手上有10塊餅乾
		for(int i =1; i<=10; i++) {
			cookie.putCookie(i);
		}
	}

}
