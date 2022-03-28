package day13_object_oriented_inner_class.innerclass2;

public class _7_Calc2Test {

	public static void main(String[] args) {
		// 圓面積
		_6_Calc2 circleArea = (r, pi) -> r * r * pi;
		System.out.println(circleArea.function(10, Math.PI));

		// 球體積
		_6_Calc2 volume = (r, pi) -> 4 / 3.0 * pi * Math.pow(r, 3);
		System.out.println(volume.function(10, Math.PI));

		// 次方 1
		_6_Calc2 pow = (n, power) -> Math.pow(n, power);
		System.out.println(pow.function(2, 3));

		// 次方 2
		_6_Calc2 pow2 = Math::pow;
		System.out.println(pow2.function(2, 3));

		// 計算 bmi
		_6_Calc2 bmi = (h, w) -> w / Math.pow(h / 100, 2);
		System.out.println(bmi.function(170, 6));

		_6_Calc2 bmi2 = (double h, double w) -> {
			double bmiValue = w / Math.pow(h / 100, 2);
			return bmiValue;
		};
		System.out.println(bmi2.function(170, 6));
	}

}
