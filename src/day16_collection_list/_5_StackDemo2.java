package day16_collection_list;

import java.util.Stack;

public class _5_StackDemo2 {

	public static void main(String[] args) {
		//題目：將 "Java" 以倒序的方式輸出
		String msg = "Java";
		char[] chars = msg.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		for(char c : chars) {
			stack.push(c);
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}

}
