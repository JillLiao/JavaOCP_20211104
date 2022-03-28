package day06_object_oriented.case8;

import java.util.Arrays;

public class DrinkStore {

	public static void main(String[] args) {
		// 我要買 "3" 杯 "中" 杯的飲料價格是多少 ?
				Drink drink = new Drink();
				//drink.amount = -3;
				drink.setAmount(3);
				//drink.size = Size.M;
				drink.setSize(Size.M);
				//drink.total = 0;
				System.out.println(drink.getTotal());
				System.out.println(drink);
				
				//-----------------------------------
				
				Drink drink2 = new Drink(20, Size.L);
				System.out.println(drink2);
				
				//-----------------------------------
				
				Drink[] drinks = {
						new Drink(10, Size.S),
						new Drink(20, Size.XL),
						new Drink(30, Size.XXL),
						new Drink(40, Size.M),
						new Drink(50, Size.L),
				};
				// 請求出總金額 ?
				System.out.println(Arrays.toString(drinks));
				
				// Java 7
				int sum = 0;
				for(Drink d: drinks) {
					sum += d.getTotal();
				}
				System.out.println(sum);
				
				// Java 8
				int sum2 = Arrays.stream(drinks)
						.mapToInt(d -> d.getTotal())
						.sum();
				System.out.println(sum2);
	}

}
