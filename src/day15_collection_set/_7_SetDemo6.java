package day15_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class _7_SetDemo6 {

	public static void main(String[] args) {
		// 複合元素
		// 若要剔除重複的元素, 則 Exam 必須實作 equals() 與 hashCode()
		_5_Exam e1 = new _5_Exam("國文", 100);
		_5_Exam e2 = new _5_Exam("數學", 100);
		_5_Exam e3 = new _5_Exam("英文", 90);
		_5_Exam e4 = new _5_Exam("英文", 90);

		Set<_5_Exam> exams = new LinkedHashSet<>();
		exams.add(e1);
		exams.add(e2);
		exams.add(e3);
		exams.add(e4);

		System.out.println(exams.size()); // 元素個數，陣列用length、集合用size
		System.out.println(exams);
	}

}
