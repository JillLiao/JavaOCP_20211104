package day10_object_oriented.exam;

public class Exam3 {

	public static void main(String[] args) {
		
		//用Java8的方法
		int end = new StringBuilder("Happy New Year And Merry Christmas")
				.reverse().toString().indexOf(" ");
		System.out.println(end);
	}

}
