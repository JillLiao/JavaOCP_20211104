package day16_collection_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class _1_ListDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(100);
		list.add(0, 80);	//因為List有維度，因此在參數前面插入數字，即表示想將資料放於該維度中，其餘未指定維度的資料將按add順序排序
		list.add(90);
		System.out.println(list);
		
		List<Integer> nums = new LinkedList<>();
		for(int i=1;i<=10;i++) {
			//nums.add(i);	//按順序加入元素
			nums.add(0, i);	//因為每次加入都是放在第一個[0]，因此最終print出來是反序的數列
		}
		System.out.println(nums);
		
		// 利用 for-loop 取資料
		System.out.println("利用 for-loop 取資料:");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 利用 for-in(each) 取資料
		System.out.println("利用 for-in(each) 取資料:");
		for(Integer i : list) {		//用型別為Integer的變數i進入list裡取出資料
			System.out.println(i);
		}
		
		// 利用 ListIterator 取資料
		System.out.println("利用 ListIterator next() 取資料:");
		ListIterator<Integer> iter = list.listIterator();
		
		while (iter.hasNext()) {		//若iterator後面還有東西(true)，便執行回圈內的指令
			System.out.println(iter.next());
		}
		System.out.println("利用 ListIterator previous() 取資料:");
		while (iter.hasPrevious()) {	//往前取資料，因此取出的順序會和iter.hasNext()相反
			System.out.println(iter.previous());
		}
	}

}
