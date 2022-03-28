package day03_multi_array.array_multi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1_1 {

	public static void main(String[] args) {
		Random r = new Random();
		char[][] ttt = { { ' ', ' ', ' ' },
				         { ' ', ' ', ' ' },
				         { ' ', ' ', ' ' } };
		//User的變數
		int sumJ =0;
		int sumK =0;
		//PC的變數
		int PCsumJ=0;
		int PCsumK=0;
		
		for (int i = 1;; i++) {
			// 印出目前陣列內容
			for (char[] t : ttt) {
				System.out.println(Arrays.toString(t));
			}
			// User 玩
			Scanner sc = new Scanner(System.in);
			System.out.print("請輸入 0~8: ");
			int n = sc.nextInt();
			int j =n / 3;
			int k =n % 3;

			// 檢查資料是否是空白 ?
			if (ttt[j][k] == ' ') {
				ttt[j][k] = 'O';
			} else {
				System.out.println("此處已有資料");
				continue;
			}
			
			//檢查玩家是否獲勝
			sumJ += j;			
			sumK += k;
			if(i >=3 && sumJ+sumK !=0 && sumJ %3 ==0 && sumK %3 ==0) {
				for (char[] t : ttt) {
					System.out.println(Arrays.toString(t));
				}
				System.out.println("You Win !!");
				break;
			}
			// ------------------------------------------------
			// PC 玩
			int PCj;
			int PCk;						
			while (true) {
				n = r.nextInt(9); // 0~8
				int x=n/3;
				int y=n%3;
				if (ttt[x][y] == ' ') {
					ttt[x][y] = 'X';
					PCj=x;
					PCk=y;
					break; // 跳離 while 迴圈
				}
			}

			//檢查PC是否獲勝
			PCsumJ +=PCj;
			PCsumK +=PCk;
			if(i>=3 && PCsumJ+PCsumK!=0 && PCsumJ%3==0  && PCsumK%3==0) {
				for (char[] t : ttt) {
					System.out.println(Arrays.toString(t));
				}
				System.out.println("PC Win !!");
				break;
			}
		}
	}
}
