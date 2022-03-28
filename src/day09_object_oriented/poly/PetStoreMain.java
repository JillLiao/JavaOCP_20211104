package day09_object_oriented.poly;

public class PetStoreMain {

	public static void main(String[] args) {
		
		PetStore petStore = new PetStore();
		_3_Cat cat = new _3_Cat();
		petStore.play(cat);
		
		_1_Pet pet = petStore.getPet();
		if(pet != null) {
			pet.shouting();
			// 若得到 Tiger 則呼叫 hunt()
			if(pet instanceof _4_Tiger) {
				((_4_Tiger)pet).hunt();
			}
		} else {
			System.out.println("銘謝惠顧");
		}
	}

}
