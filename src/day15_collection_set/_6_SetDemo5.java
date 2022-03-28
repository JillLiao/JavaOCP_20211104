package day15_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _6_SetDemo5 {

	public static void main(String[] args) {
		//複合元素
		Set set1 = new HashSet();
		// 會依照 hash 值擺放元素, 而不會依照加入的順序擺放元素
		set1.add("國文");
		set1.add(Integer.valueOf(100));
		set1.add("數學");
		set1.add(90);
		set1.add("英文");
		set1.add(80);
		System.out.println(set1);
		
		System.out.println("------------------------------");
		// 會依照加入的順序擺放元素
		Set set2 = new LinkedHashSet();
		set2.add("國文");
		set2.add(Integer.valueOf(100));
		set2.add("數學");
		set2.add(90);
		set2.add("英文");
		set2.add(80);
		System.out.println(set2);
	}

}
