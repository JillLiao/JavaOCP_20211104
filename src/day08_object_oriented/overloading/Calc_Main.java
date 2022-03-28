package day08_object_oriented.overloading;

public class Calc_Main {

	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.add(10.5, 20.5));

		//帶入的參數為整數(int)時，compiler會先去找data type最適合的方法，
		//實作優先順序為：int →　float → double → Integer
		//實作時會先找基本資料型別
		//float會優先於double的原因是，int與float的資料長度都是32 bit
		//double原本就可容納int，因此會先實作double，而非物件的Integer
		//Java 5之後auto-boxing，所以即便int參數帶入Integer方法也是OK的
		
	}

}
