package day02_string_char.method;

public class Calc {
	// 設計一個 add 方法
	// x, y 表示所帶入的參數
	// return 回傳
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}

	// 設計一個 bmi 計算方法
	// h, w 表示身高,體重的參數
	// return bmi的值
	public double getBMI(double h, double w) { // 方法簽章 API
		double bmi = w / Math.pow(h / 100, 2);
		return bmi;
	}

	// 設計一個計算 int[] 陣列總分的的方法
	// 有一個 int[] 參數
	// return int 結果
	public int getSum(int[] scores) {
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return sum;
	}

	// 寫一個 welcome 方法 (無回傳值 void)
	// 有一個 name 的 String 參數
	// return; 或不寫也可以
	public void welcome(String name) {
		System.out.println("歡迎" + name + "蒞臨指導");
	}

	public void welcome() {
		System.out.println("歡迎您蒞臨指導");
		return; // 可寫可不寫
	}
}
