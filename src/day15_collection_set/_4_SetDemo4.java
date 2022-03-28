package day15_collection_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _4_SetDemo4 {

	public static void main(String[] args) {
		// 複合元素，重要！！！
		_5_Exam e1 = new _5_Exam("國文",100);
		_5_Exam e2 = new _5_Exam("英文",100);
		_5_Exam e3 = new _5_Exam("數學",90);
		
		Set<_5_Exam> scores = new HashSet<>();
		scores.add(e1);
		scores.add(e2);
		scores.add(e3);
		System.out.println(scores);
		//求總分?
		
		int sum = 0;
		Iterator<_5_Exam> iter = scores.iterator();
		while (iter.hasNext()) {
			sum += iter.next().getScore();			
		}
		System.out.println("本次考試總分為: " + sum);
		
		System.out.println("-------練習用串流改寫-------");
		//set是集合，不是陣列，所以不能用老方法Arrays.stream(scores)
		int sum2 = scores.stream().mapToInt(sc -> sc.getScore()).sum();	
		System.out.println("本次考試總分為: "+ sum2);
	}

}
