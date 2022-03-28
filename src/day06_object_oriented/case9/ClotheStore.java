package day06_object_oriented.case9;

import java.util.Arrays;

public class ClotheStore {

	public static void main(String[] args) {
		System.out.println(Clothe.brandName);
		Clothe c1 = new Clothe();
		System.out.println(c1);
		
		Clothe c2 = new Clothe();
		c2.setAmount(10);
		c2.setSize(Size.L); // c2.setSize(500);
		System.out.println(c2);
		
		Clothe c3 = new Clothe();
		c3.setAmount(5);
		System.out.println(c3);
		
		Clothe c4 = new Clothe();
		c4.setSize(Size.S);
		System.out.println(c4);
		
		System.out.println("------------------------------------------");
		
		Clothe[] clothes = {c1, c2, c3, c4};
		// 請問"M"號的衣服共賣出幾件 ?
		int sum = Arrays.stream(clothes)
					.filter(c -> c.getSize() == Size.M)
					.peek(c -> System.out.println(c))
					.mapToInt(c -> c.getAmount())
					//.peek(c -> System.out.println(c))
					.sum();
		System.out.println(sum);
	}

}
