package day11_object_oriented_pattern.decorator;

import java.util.Arrays;

public class Subway2 {

	public static void main(String[] args) {
				// 鮪魚堡
				Food f1 = new Bread();
				f1 = new Tuna(f1);
				f1 = new Tomato(f1);
				f1 = new Lettuce(f1);
				f1 = new Onion(f1);
				f1 = new Olive(f1);
				f1 = new Cheese(f1);
				System.out.println(f1.getName());
				
				// 火腿堡
				Food f2 = new Bread();
				f2 = new Ham(f2);
				f2 = new Lettuce(f2);
				f2 = new Onion(f2);
				f2 = new Cheese(f2);
				System.out.println(f2.getName());
				
				// 結帳
				Food[] foods = {f1, f2};
				// 利用 java 8 求 foods 裡面二個堡的總價
				int sum = Arrays.stream(foods)
							.mapToInt(Food::getPrice)
							.sum();
				System.out.println(sum);
	}

}
