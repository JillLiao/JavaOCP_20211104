package day15_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _1_SetDemo1 {

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

		// 走訪元素內容 Iterator (一步一步做)
		// Iterator是集合的走訪器 (詢訪器)
		// hasNext()會去尋找下一個位置是否有元素存在，並回傳布林值 (True/False)
		// next()則會將下一個元素抓出來
		Iterator iter = set.iterator();
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
//		System.out.println(iter.next());	//若hasNext()已經回傳false了，還硬要next()抓出下一個元素，則會產生執行錯誤
		System.out.println("---------------");

		// 走訪元素內容 Iterator (使用 while)
		// iterator一旦走到集合的末端時就會停留在末端了，要讓它重新來過的話就必須再申請一個iterator
		// 重新再取得一個走訪器(iter)
		iter = set.iterator();	//這次前面就不需要再加上 Iterator 了
		while (iter.hasNext()) {	//當走到集合的末端，發現下一個位置沒有元素時，回傳的False可讓程式跳出while迴圈
			Object object = (Object) iter.next();	//(Object)轉型可以刪除，因為集合本身的元素必定為物件類別，不須再轉型
			System.out.print(object + " ");
		}
	}

}
