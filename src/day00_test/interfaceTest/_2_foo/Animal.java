package day00_test.interfaceTest._2_foo;

import day00_test.interfaceTest._1_bar.Ability;

public abstract class Animal implements Ability{
	public int legs;
	
	public abstract void eat();
	public void move() {
		System.out.println("動物會移動");
	}
}
