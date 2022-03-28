package day23_thread_control;

public class _16_Cat implements Runnable {
	private _14_Fish fish;

	public _16_Cat(_14_Fish fish) {
		this.fish = fish;
	}

	@Override
	public void run() {
		// 貓最多可以吃10隻魚
		for (int i = 1; i <= 10; i++) {
			fish.eatFish(i);
		}
	}

}
