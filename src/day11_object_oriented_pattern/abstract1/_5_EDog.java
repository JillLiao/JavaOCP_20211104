package day11_object_oriented_pattern.abstract1;

public class _5_EDog implements _1_Dog_interface{
	//此類別也可以作成抽象類別，未來若要將【狗】分為【活的狗】、【機械狗】二大類的話，會更好區分
	
	@Override
	public void play() {
		System.out.println("Play Game");
	}
	
	@Override
	public void eat() {
		System.out.println("吃電");
	}

}
