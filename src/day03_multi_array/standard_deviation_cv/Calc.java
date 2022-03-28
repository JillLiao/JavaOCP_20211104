package day03_multi_array.standard_deviation_cv;

import java.util.stream.DoubleStream;

public class Calc {
	// 1. 取得標準差的方法
	public double getSD(double[] array) {
		double avg = getAvg(array);
		double cum = DoubleStream.of(array).map(x -> Math.pow(x - avg, 2)).sum();
		double sd = Math.sqrt(cum / array.length);
		return sd;
	}

	// 2. 取得變異係數的方法
	public double getCV(double[] array) {
		double avg = getAvg(array);
		double sd = getSD(array);
		double cv = sd / avg;
		return cv;
	}

	// 3. 取得平均的方法
	public double getAvg(double[] array) {
		double avg = DoubleStream.of(array).average().getAsDouble();
		return avg;
	}
}
