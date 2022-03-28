package day04_wrapper_stream;

public class Case01 {

	public static void main(String[] args) {
		
		// 取出 int 的最大值
		int max = Integer.MAX_VALUE;
		System.out.println(max);

		String x = "100";
		String y = "80";
		System.out.println(x + y);
		// 字串轉數字
		int a = Integer.parseInt(x); // 將 "100" 變成 100
		int b = Integer.parseInt(y); // 將 "80" 變成 80
		System.out.println(a + b);

		String height = "170.0";
		String weight = "60.5";
		// 求 bmi = ?
		double h = Double.parseDouble(height);
		double w = Double.parseDouble(weight);
		double bmi = w / Math.pow(h / 100, 2);
		System.out.println(bmi);

		// 數字(也包含浮點數)轉字串
		int d = 100;
		int e = 80;
		String f = String.valueOf(d) + String.valueOf(e);
		System.out.println(f);

		String g = d + "" + e;
		System.out.println(g);
	}
}
