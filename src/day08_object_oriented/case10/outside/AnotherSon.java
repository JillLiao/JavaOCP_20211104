package day08_object_oriented.case10.outside;

import day08_object_oriented.case10.family.Father;

public class AnotherSon {
	public void exec() {
		Father father = new Father();
		father.play();
	}
}
/*
	※存取權限：
	1.public:權限開放，皆可存取
	2.protected: (1)同package皆可存取
				 (2)不同package要繼承曾能存取
	3.無修飾字: 同package才能存取
	4.private: 同class才可以存取
	
	※class的存取權限只有【public】、【無修飾字】二種，
	 屬性、方法的存取權限就4種都有
	
*/
