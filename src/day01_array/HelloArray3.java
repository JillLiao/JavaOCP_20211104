package day01_array;

public class HelloArray3 {

	public static void main(String[] args) {
		int[] scores = {5, 4, 3, 2, 1};
		// 請依序印出 1, 2, 3, 4, 5
		for(int i=scores.length-1;i>=0;i-=2) {
			System.out.println(scores[i]);
		}

	}

}
