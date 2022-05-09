package day00_test.interfaceTest._1_bar;

public interface Ability {
	int growthUnit =5;
	
	void reaction();
	
	default int metabolism() {
		System.out.println("它會新陳代謝");
		return 10;
	}
	static void organic() {
		System.out.println("它是有機生物");
	}
}
