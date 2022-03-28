package day09_object_oriented.poly;

public class _5_Test {

	public static void main(String[] args) {
		_2_Dog dog = new _2_Dog();
		dog.shouting();
		_3_Cat cat = new _3_Cat();
		cat.shouting();
		_4_Tiger tiger = new _4_Tiger();
		tiger.shouting();
		tiger.hunt();
		
		System.out.println("---------------------------------");
		
		_3_Cat cat2 = new _4_Tiger();	//將老虎視為一隻大貓咪
		cat2.shouting();	//用多型建立出來的【貓】物件，本體是【老虎】，共同的方法只有shouting，
		//在多型的狀況下，只有二者共同擁有的【方法】(繼承、覆寫)才能被合法的使用
		
		((_4_Tiger)cat2).hunt(); // 若硬要使用子類別中非共同擁有的方法，就必須要透過轉型來呼叫
		//但多型的意義並不在這裡，請參考後續的PetStore
	}

}
