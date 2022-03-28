package day08_object_oriented.overriding;

public class Main {
	public static void main(String[] args) {
		Father father = new Father();
		father.play();
		Son son = new Son();
		son.play();
		//Condition 1.
		//Son繼承了Father，但沒有overriding play()方法，
		//所以用son.play()叫出來的是Father的play()
		//--------------------------------------
		
		//Condition 2.
		//Son繼承了Father，且overriding play()方法，
		//son.play()叫出來的就是Son自己的play()
	}
}
