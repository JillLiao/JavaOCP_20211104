package day01_array;

public class HelloArray1 {

	public static void main(String[] args) {
		int[] scores = {100, 90, 80, 75};
		System.out.println(scores);
		// 印出: [I@123a439b
		System.out.println(scores[0]);
		scores[0] = 95;
		System.out.println(scores[0]);
		System.out.println(scores.length);
	}

}
