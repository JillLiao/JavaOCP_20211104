package day01_array;

import java.util.Arrays;
import java.util.Random;

public class HelloArray4 {

	public static void main(String[] args) {
		int[] poker = new int[13];
		System.out.println(Arrays.toString(poker));
		for(int i=0; i<poker.length; i++) {
			poker[i] = (i+1);	//利用迴圈將值放入陣列
		}
		System.out.println(Arrays.toString(poker));
		// 洗牌 shuffle
		Random r = new Random();
		int count = 8;
		for(int i=1;i<=count;i++) {
			int index1 = r.nextInt(poker.length); // poker.length=13;因此這個random會隨機抽出 0~12 範圍內，共計13種數字
			int index2 = r.nextInt(poker.length); // 0~12
			int a1 = poker[index1];
			int a2 = poker[index2];
			poker[index1] = a2;	//2張牌互換位置，達到洗牌效果
			poker[index2] = a1;
		}
		
		System.out.println(Arrays.toString(poker));

	}

}
