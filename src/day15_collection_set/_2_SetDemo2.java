package day15_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _2_SetDemo2 {

	public static void main(String[] args) {
		// 單元素 → 業界很少用到單元素集合
		// 集合裡面無法放基本 data type，只能放物件，因此集合就是物件的陣列
		// HashSet 的元素是按照 Hash code (雜湊碼) 來擺放
		Set set = new HashSet();
		set.add("國文"); // String
		set.add(100); // Integer
		set.add("英文");
		set.add(90);
		set.add("數學");
		set.add(80);

		System.out.println(set);
		
		// 計算本次考試的總分?
		int sum = 0;
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			Object object = iter.next();
			if(object instanceof Integer) {		//利用instanceof來判斷data type
				sum += (Integer)object;	//Integer 可以連加是因為auto-unboxing
			}
		}
		System.out.println("本次考試總分為: " + sum);
	}

}
