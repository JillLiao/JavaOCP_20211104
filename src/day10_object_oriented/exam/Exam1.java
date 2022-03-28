package day10_object_oriented.exam;

import java.util.Arrays;

public class Exam1 {

	public static void main(String[] args) {
		String s = "Happy New Year And Merry Christmas";
		String[] array = s.split(" "); //  利用空格切割字串，再將單字作為元素放進陣列
		System.out.println(Arrays.toString(array));
		
		int len = array.length;
		
		String lastword = array[len - 1]; // 最後一個字
		System.out.println(lastword);
		System.out.println(lastword.length());
		
	}

}
