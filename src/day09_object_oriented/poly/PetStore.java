package day09_object_oriented.poly;

import java.util.Random;

public class PetStore {
		// 寵物測試台
		public void play(_1_Pet pet) {
			pet.shouting();
		}
		
		// 給我一隻寵物
		public _1_Pet getPet() {
			Random r = new Random();
			int n = r.nextInt(4); // 0, 1, 2, 3
			switch (n) {
				case 0:
					return new _2_Dog();
				case 1:
					return new _3_Cat();
				case 2:
					return new _4_Tiger();	
				default:
					return null;
			}
		}
}
