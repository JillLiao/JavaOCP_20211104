package day02_string_char.method;

public class CalcMain {

	public static void main(String[] args) {
		Calc calc = new Calc();
		int r = calc.add(10, 30);
		System.out.println(r);
		
		double bmiValue = calc.getBMI(170.0, 60.0);
		System.out.println(bmiValue);
		
		int[] x = {100, 90, 80};
		int sum = calc.getSum(x);
		System.out.println(sum);
		
		int sum2 = calc.getSum(new int[] {100, 90, 80});
		System.out.println(sum2);
		
		
		calc.welcome("John");
		
		calc.welcome();
	}
}
