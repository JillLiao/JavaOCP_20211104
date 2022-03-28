package day16_collection_list;

import java.util.Vector;
//Vector 因為可以多工，故其使用得非常廣泛，尤其在網路世界可公開查詢、存取的資料，在唯讀時非常好用，缺點是牽涉到修改時就會很麻煩了
//Vector(初始開設空間數,資料增長空間數); 建立時，若沒有額外給定參數，它會(預設)在記憶體開出10個資料空間(capacity)，
//然後當空間不足時，會以【原資料長度*2】的方式增長
public class _6_VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(1300,5);
		System.out.printf("size: %d capacity: %d\n", v.size(), v.capacity());
		for(int i=1; i<=1300; i++) {
			v.add(1);
		}
		v.add(1); // 突然多增加一筆資料
		System.out.printf("size: %d capacity: %d\n", v.size(), v.capacity());
	}

}
