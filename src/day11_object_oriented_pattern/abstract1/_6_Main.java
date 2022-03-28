package day11_object_oriented_pattern.abstract1;

public class _6_Main {

	public static void main(String[] args) {
		_2_ADog_abstract d1 = new _3_Shiba();
		_2_ADog_abstract d2 = new _4_Husky();
		_1_Dog_interface d3 = new _5_EDog();
		d1.eat();d1.play();
		d2.eat();d2.play();
		d3.eat();d3.play();
		// 將所有狗放一起
		_1_Dog_interface [] dogs = {d1, d2, d3};
		
		System.out.println("----------");
		
		// 將所有活狗放一起
		_2_ADog_abstract [] aDogs = {d1, d2};
	}

}
