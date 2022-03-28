package day16_collection_list;

import java.util.Stack;

public class _3_StackDemo {	
	//堆疊(Stack): 後進先出，例如--摺好的衣服、穀倉、抽卡牌
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("John");
		stack.push("Mary");
		stack.push("Bobo");
		System.out.println("資料內容: " + stack);
		while (!stack.isEmpty()) {
			String name = stack.pop();
			System.out.println(name);
		}
		System.out.println("資料內容: " + stack);
	}

}
