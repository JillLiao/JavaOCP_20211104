package day23_thread_control;

public class _15_CatMaster implements Runnable {
	private _14_Fish fish;

	public _15_CatMaster(_14_Fish fish) {
		this.fish = fish;
	}

	@Override
	public void run() {
		// 主人手上有10隻魚
		for (int i = 1; i <= 10; i++) {
			fish.putFish(i);
		}
	}

}
