package day03_multi_array.standard_deviation_cv;

/*
 * 調查五位學生之身高及體重如下，試比較其分散程度。
 * 身高：172、168、164、170、176(公分)
 * 體重：62、57、58、64、64(公斤)
 * */
public class Case2 {

	public static void main(String[] args) {
		double[] heights = { 172, 168, 164, 170, 176 };
		double[] weights = { 62, 57, 58, 64, 64 };

		// 計算變異係數
		Calc calc = new Calc();
		double h_cv = calc.getCV(heights);
		double w_cv = calc.getCV(weights);
		System.out.println("身高 CV: " + h_cv);
		System.out.println("體重 CV: " + w_cv);

		// 比較分散程度
		String result = h_cv > w_cv ? "身高" : "體重";
		System.out.println(result + "的分散程度大");
	}
}
