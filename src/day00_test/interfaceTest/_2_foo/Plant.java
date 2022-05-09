package day00_test.interfaceTest._2_foo;

import day00_test.interfaceTest._1_bar.Ability;

public abstract class Plant implements Ability{
	
	public int seed;
	
	public abstract void leaves();
	
	public void action() {
		System.out.println("植物會光合作用");
	}
}
