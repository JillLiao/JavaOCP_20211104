package day12_daynamic_array;

import java.util.ArrayList;

public class _5_ArrayListDemo3 {

	public static void main(String[] args) {
		_4_Gift g1 = new _4_Gift(1, "特獎", 1);
		_4_Gift g2 = new _4_Gift(2, "頭獎", 2);
		_4_Gift g3 = new _4_Gift(3, "貳獎", 4);
		_4_Gift g4 = new _4_Gift(4, "三獎", 10);
		_4_Gift g5 = new _4_Gift(5, "四獎", 50);
		_4_Gift g6 = new _4_Gift(6, "五獎", 100);
		ArrayList<_4_Gift> gifts = new ArrayList<>();
		gifts.add(g1);
		gifts.add(g2);
		gifts.add(g3);
		gifts.add(g4);
		gifts.add(g5);
		gifts.add(g6);
		System.out.println("獎品:" + gifts);
		System.out.println("獎項:" + gifts.size());
		// 請問每一個獎項的數量各有多少 ?
		for (_4_Gift gift : gifts) {
			System.out.printf("%s 有 %d 個\n", gift.getName(), gift.getCount());
		}
		// 抽到 "貳獎", 並將 count 減 1
		// 得到 "貳獎" 物件
		_4_Gift gift = null;
		for (_4_Gift g : gifts) {
			if (g.getName().equals("貳獎")) {
				gift = g;
				break;
			}
		}
		System.out.println("貳獎物件: " + gift);
		// 貳獎物件 count - 1
		gift.setCount(gift.getCount() - 1);
		// 請問每一個獎項的數量各有多少 ?
		for (_4_Gift g : gifts) {
			System.out.printf("%s 有 %d 個\n", g.getName(), g.getCount());
		}
	}

}
