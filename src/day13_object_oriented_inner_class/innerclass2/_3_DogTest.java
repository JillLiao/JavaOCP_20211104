package day13_object_oriented_inner_class.innerclass2;

public class _3_DogTest {

	public static void main(String[] args) {
		_1_Dog dog = new _2_Dog_implement();
		dog.skill();
		
		//匿名類別，用$1、$2、$3....序號去存取
		_1_Dog dog2 = new _1_Dog() {
			public void skill() {
				System.out.println("陪伴");
			}
		};
		dog2.skill();
		
		_1_Dog dog3 = new _1_Dog() {
			public void skill() {
				System.out.println("賣萌");
			}
		};
		dog3.skill();
		
	}

}
