package day01_array;

import java.util.Arrays;

public class HelloArray2 {
	
	public static void main(String[] args) {
		int[] scores = {100, 90, 80, 75};
		//方法1.利用 for loop 將資料全部印出
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//方法2.利用 for loop 將資料全部印出
		//減少for回圈內的檢驗計算，把變數lens拉到全域後可提升迴圈執行效率
		int lens = scores.length;
		for(int i=0; i<lens; i++) {
			System.out.println(scores[i]);
		}
		
		//方法3.利用 for loop 將資料全部印出
		//把變數併到for宣告部分，變成只需要算一次，且迴圈結束後變數可以消失
		//又快又省記憶體空間
		for(int i=0, lenss=scores.length; i<lenss; i++) {
			System.out.println(scores[i]);
		}
		
		//方法4.利用 for-each(in) 將資料全部印出
		//專門針對集合性的資料進行導覽
		//寫法簡便，但執行速度比較慢，且限制比較多，只能順序讀取無法反序讀取
		for(int x: scores) {
			System.out.println(x);
		}
		
		//方法5.用Java.util裡的Arrays的API
		//寫法簡便，但執行速度比較慢
		//陣列宣告完畢，產生實際物件實體位址後，就可以用Arrays.toString()把內容拉出來
		System.out.println(Arrays.toString(scores));
	}
}
