package day12_daynamic_array;

import java.util.ArrayList;

//ArrayList 一種集合(動態陣列)
public class _1_ArrayListDemo {
	public static void main(String[] args) {
		// 建立一個以 Integer(整數) 為元素內容的資料集合
		// 例如: [2, 3, 4, 5, 6, 7]
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2); // 新增一個 Integer 2 的元素, auto-boxing
		nums.add(Integer.valueOf(3));
		nums.add(4); // 相當於 Integer.valueOf(4)
		nums.add(5); // 相當於 Integer.valueOf(5)
		nums.add(6); // 相當於 Integer.valueOf(6)
		nums.add(7); // 相當於 Integer.valueOf(7)
		System.out.println(nums);
		// 取得資料, 透過 index
		System.out.println(nums.get(0));
		// 刪除
		nums.remove(2); // 移除位置 index = 2 的資料
		System.out.println(nums);
		// 我要刪除內容 = 5 的元素
		nums.remove(Integer.valueOf(5));
		System.out.println(nums);
		
	}
}
