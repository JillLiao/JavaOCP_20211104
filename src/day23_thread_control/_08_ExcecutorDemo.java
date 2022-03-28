package day23_thread_control;

import java.util.concurrent.Executor;

public class _08_ExcecutorDemo {

	public static void main(String[] args) {
		//用多型建立任務物件
		Runnable r1 = new _06_GetLotto();
		Runnable r2 = new _07_GetTime();
		
		//用多型建立執行者
		Executor exec = new _05_MyExcecutor();
		
		//用 Executor 中的 execute(Runnable r) 方法執行任務
		exec.execute(r1);
		exec.execute(r1);
		exec.execute(r2);
		
		//如此一來主程式就只要有【任務】、【執行者】就好，不需去理會執行緒的問題
		//執行緒的問題由Executor取處理
	}
}
