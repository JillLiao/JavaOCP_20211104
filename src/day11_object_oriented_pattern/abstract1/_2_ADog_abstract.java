package day11_object_oriented_pattern.abstract1;

public abstract class _2_ADog_abstract implements _1_Dog_interface{

	@Override						//這一段是可以刪除的，因為後面的類別繼承ADog時，必然也會順便繼承Dog的play()
	public abstract void play();	//但若將此段刪除，且同時刪除class前的abstract，會出現編譯錯誤，因為實作了interface後
									//必須要覆寫interface訂定的方法
	@Override
	public void eat() {
		System.out.println("吃狗糧");
	}

}
