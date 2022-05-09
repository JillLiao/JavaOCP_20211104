package day00_test.interfaceTest._3_life;

import day00_test.interfaceTest._2_foo.Plant;

public class Tree extends Plant{
	int seed;
	
	@Override
	public void reaction() {
		System.out.println("樹會與周遭環境產生交互作用");
	}

	@Override
	public void leaves() {
		System.out.println("樹的葉子是綠色的");
	}
	
	private void tall() {
		System.out.println("長高高");
	}

}
