package day23_thread_control;

//import java.util.concurrent.Executor;

public class _04_MastersAndPets {

	public static void main(String[] args) {
		_01_Cookie cookie = new _01_Cookie();
		_14_Fish fish = new _14_Fish();
		
		Thread dogMaster = new Thread(new _02_Master(cookie),"狗主人");
		Thread dog = new Thread(new _03_Dog(cookie),"狗狗");
		
		Thread catMaster = new Thread(new _15_CatMaster(fish),"貓主人");
		Thread cat = new Thread(new _16_Cat(fish),"貓貓");		
		
		dogMaster.start();
		dog.start();
		
		catMaster.start();
		cat.start();
		
//-------- 用Executor改寫 --------------------------
		
//		Runnable master = new _02_Master(cookie);
//		Runnable dog = new _03_Pet(cookie);
//		
//		Executor exec = new _05_MyExcecutor();
//		exec.execute(master);
//		exec.execute(dog);
	}
}
