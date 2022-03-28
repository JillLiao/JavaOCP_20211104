package day15_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _3_SetDemo3 {

	public static void main(String[] args) {
		//單元素 → 業界很少用到單元素集合，以本程式為例，只有數字根本看不出哪個科目多少分，
		//即便加入科目名，如Demo2範例，HashSet的排列順序仍使人類無法看出每個科目對應的分數，這就是單元素的缺點
		//泛型 <>
		//用以限制元素的資料型別
		//編譯時期就會檢查、判斷了，執行時反而會拿掉
		Set<Integer> scores = new HashSet<>();	//Java7之後，右邊的<>裡面就不用再寫Integer了，編譯器會自己判斷
		scores.add(100);	//此集合內現在只能放Integer了
		scores.add(100);	// Set集合不允許重複的資料，加入重複的元素時程式不會出錯，但它會自動reject，因此print時仍然只有一個100
		scores.add(100);	// 重複的元素不會納入
		scores.add(90);
		scores.add(80);
//		scores.add("國文");	//因為泛型<Integer>的限制，集合內不能加入String
		System.out.println(scores);
		
		int sum = 0;
		Iterator<Integer> iter = scores.iterator();
		while (iter.hasNext()) {
			sum += iter.next();			
		}
		System.out.println("本次考試總分為: " + sum);
	}
}
