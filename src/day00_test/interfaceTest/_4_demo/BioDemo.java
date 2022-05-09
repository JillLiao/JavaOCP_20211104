package day00_test.interfaceTest._4_demo;

import day00_test.interfaceTest._1_bar.Ability;
import day00_test.interfaceTest._2_foo.Animal;
import day00_test.interfaceTest._2_foo.Plant;
import day00_test.interfaceTest._3_life.Cow;
import day00_test.interfaceTest._3_life.Tree;

public class BioDemo {
	public static void main(String[] args) {
		Animal cow1 = new Cow();
		Cow cow2 = new Cow();
		Plant tree1 = new Tree();
		Tree tree2 = new Tree();
		Ability cow = new Cow();
		
		cow1.reaction();
		cow1.eat();
		cow1.move();
		cow2.reaction();
		cow2.eat();
		cow2.move();
		cow1.metabolism();
		Ability.organic();
		
		cow.reaction();
		System.out.println("小牛每個週可長"+Ability.growthUnit+"公斤");
		
		System.out.println("-------------------");
		
		tree1.reaction();
		tree1.leaves();
		tree1.action();
		
		tree2.reaction();
		tree2.leaves();
		tree2.action();
//		tree2.tall();
		tree1.metabolism();
		Ability.organic();
		System.out.println("樹苗每個月可長"+Ability.growthUnit+"公分");
	}
}
