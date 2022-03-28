package day11_object_oriented_pattern.abstract2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// 所有能夠提供的武器一起發射
				_6_Weapon w1 = new _3_Tank();
				_6_Weapon w2 = new _5_Fighter();
				_6_Weapon[] weapons = {w1, w2};
				
				Arrays.stream(weapons).forEach(w -> w.fire());
				System.out.println("------------");
				Arrays.stream(weapons).forEach(_6_Weapon::fire);//Java 8 的寫法，方法參數，目的是減少贅字
	}

}
