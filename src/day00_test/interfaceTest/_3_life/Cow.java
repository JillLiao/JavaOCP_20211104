package day00_test.interfaceTest._3_life;

import day00_test.interfaceTest._2_foo.Animal;

public class Cow extends Animal{

	@Override
	public void reaction() {
		System.out.println("牛喜歡曬太陽");
	}

	@Override
	public void eat() {
		System.out.println("牛吃草");
	}
	
	public void eat2() {
		System.out.println("反芻");
	}
}
