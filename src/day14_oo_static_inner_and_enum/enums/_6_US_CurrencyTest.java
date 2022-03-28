package day14_oo_static_inner_and_enum.enums;

public class _6_US_CurrencyTest {

	public static void main(String[] args) {
		// PENNY:1, NICKEL:5, DIME:10, QUARTER:25，但int型別並未規定只能輸入前面幾個數字，導致有人可以輸入99之類的錯誤參數
		
		_5_US_Currency usCoin = _5_US_Currency.NICKEL;	//藉由NICKEL這個建構式，將5帶入private的建構子參數，使之建立物件
														//不能使用new
		System.out.println(usCoin.getValue());
	}

}
