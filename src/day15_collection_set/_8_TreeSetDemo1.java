package day15_collection_set;

import java.util.Set;
import java.util.TreeSet;

public class _8_TreeSetDemo1 {

	public static void main(String[] args) {
		// TreeSet 的優勢查詢元素資料快
		Set<Integer> nums = new TreeSet<>();
		nums.add(8);
		nums.add(2);
		nums.add(6);
		nums.add(5);
		nums.add(9);
		nums.add(1);
		nums.add(3);
		System.out.println(nums);
	}

}
