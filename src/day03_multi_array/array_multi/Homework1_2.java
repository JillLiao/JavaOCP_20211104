package day03_multi_array.array_multi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1_2 {

	public static void main(String[] args) {
		Random r = new Random();
		char[][] ttt = { { ' ', ' ', ' ' },
				         { ' ', ' ', ' ' },
				         { ' ', ' ', ' ' } };

		for (int i = 1;; i++) {
			
			// 印出目前陣列內容
			for (char[] t : ttt) {
				System.out.println(Arrays.toString(t));
			}
			
			// User 玩
			Scanner sc = new Scanner(System.in);
			System.out.print("請輸入 0~8: ");
			int n = sc.nextInt();
			
			// 檢查資料是否是空白 ?
			if (ttt[n/3][n%3] == ' ') {
				ttt[n/3][n%3] = 'O';
			} else {
				System.out.println("此處已有資料");
				continue;
			}
			
			//檢查玩家是否獲勝
			if(ttt[0][0]=='O' && ttt[0][1]=='O' && ttt[0][2]=='O' ||		//獲勝組合1
			   ttt[1][0]=='O' && ttt[1][1]=='O' && ttt[1][2]=='O' ||		//獲勝組合2
			   ttt[2][0]=='O' && ttt[2][1]=='O' && ttt[2][2]=='O' ||		//獲勝組合3
			   ttt[0][0]=='O' && ttt[1][0]=='O' && ttt[2][0]=='O' ||		//獲勝組合4
			   ttt[0][1]=='O' && ttt[1][1]=='O' && ttt[2][1]=='O' ||		//獲勝組合5
			   ttt[0][2]=='O' && ttt[1][2]=='O' && ttt[2][2]=='O' ||		//獲勝組合6
			   ttt[0][0]=='O' && ttt[1][1]=='O' && ttt[2][2]=='O' ||		//獲勝組合7
			   ttt[0][2]=='O' && ttt[1][1]=='O' && ttt[2][0]=='O' ) {		//獲勝組合8
				for (char[] t : ttt) {
					System.out.println(Arrays.toString(t));
				}
				System.out.println("You Win !!");
				break;
			}
			//終局不分勝負(Tie)
			//計算非空白(O + X)元素的數量，數量已達9卻無勝利者即表示不分勝負，
			//遊戲應重新開始
			int x=0;
			int count= 0;
			for(int j=0; j<3; j++) {				
				for(int k=0; k<3; k++) {
					if(ttt[j][k] != ' ') {
						x=1;
					}else {
						x=0;
					}
					count += x;
				}
			}
						
			if(count == 9) {
				for (char[] t : ttt) {
					System.out.println(Arrays.toString(t));
				}
				System.out.println("It is a tie, please restart the game.");
				break;
			}
			// ------------------------------------------------
			// PC 玩			
			while (true) {
				n = r.nextInt(9); // 0~8
				if (ttt[n/3][n%3] == ' ') {
					ttt[n/3][n%3] = 'X';
					break; // 跳離 while 迴圈
				}
			}

			//檢查PC是否獲勝
			if(ttt[0][0]=='X' && ttt[0][1]=='X' && ttt[0][2]=='X' ||		//獲勝組合1
			   ttt[1][0]=='X' && ttt[1][1]=='X' && ttt[1][2]=='X' ||		//獲勝組合2
		  	   ttt[2][0]=='X' && ttt[2][1]=='X' && ttt[2][2]=='X' ||		//獲勝組合3
			   ttt[0][0]=='X' && ttt[1][0]=='X' && ttt[2][0]=='X' ||		//獲勝組合4
			   ttt[0][1]=='X' && ttt[1][1]=='X' && ttt[2][1]=='X' ||		//獲勝組合5
			   ttt[0][2]=='X' && ttt[1][2]=='X' && ttt[2][2]=='X' ||		//獲勝組合6
			   ttt[0][0]=='X' && ttt[1][1]=='X' && ttt[2][2]=='X' ||		//獲勝組合7
			   ttt[0][2]=='X' && ttt[1][1]=='X' && ttt[2][0]=='X' ) {		//獲勝組合8
				for (char[] t : ttt) {
					System.out.println(Arrays.toString(t));
				}
				System.out.println("PC Win !!");
				break;
			}
		}
	}

}
