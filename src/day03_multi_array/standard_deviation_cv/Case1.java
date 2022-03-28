package day03_multi_array.standard_deviation_cv;

import java.util.Arrays;
import java.util.stream.DoubleStream;

/*
 * 調查五位學生之身高及體重如下，試比較其分散程度。
 * 身高：172、168、164、170、176(公分)
 * 體重：62、57、58、64、64(公斤)
 * */
public class Case1 {

	public static void main(String[] args) {
		double[] heights = { 172, 168, 164, 170, 176 };
		double[] weights = { 62, 57, 58, 64, 64 };

		// 計算標準差
		// 計算平均
		double hAvg = DoubleStream.of(heights).average().getAsDouble();
		double wAvg = DoubleStream.of(weights).average().getAsDouble();
		
		//double havg = Arrays.stream(heights).average().getAsDouble();

		// 計算身高標準差
		double h_cum = 0;
		for (double h : heights) {
			h_cum += Math.pow(h - hAvg, 2);
		}
		double h_sd = Math.sqrt(h_cum / heights.length);

		// 計算體重標準差
		double w_cum = 0;
		for (double w : weights) {
			w_cum += Math.pow(w - wAvg, 2);
		}
		double w_sd = Math.sqrt(w_cum / weights.length);

		System.out.println("身高 SD: " + h_sd);
		System.out.println("體重 SD: " + w_sd);

		// 計算身高與體重的變異係數
		double h_cv = h_sd / hAvg;
		double w_cv = w_sd / wAvg;
		System.out.println("身高 CV: " + h_cv);
		System.out.println("體重 CV: " + w_cv);

		// 分散程度
		String result = h_cv > w_cv ? "身高" : "體重";
		System.out.println(result + "的分散程度大");
	}
}
