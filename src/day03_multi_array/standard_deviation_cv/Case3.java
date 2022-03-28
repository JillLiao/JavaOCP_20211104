package day03_multi_array.standard_deviation_cv;
/*
 * 某公司有18位員工，
 * 其中 10 位在去年投資股票，一年的獲利率如下(單位：%)：
 * 7.6 3.9 15.6 28.3 1.2 10.8 35.3 45.6 10.2 0.5
 * 
 * 另外 8 位員工投資買公債一年內獲利率如下(單位：%)
 * 6.8 7.2 6.8 7.5 6.9 7.9 7.9 7.1 7.2
 * 試分別求此公司的員工投資股票與公債的獲利率變異係數 ? 與何種投資較為穩健 ?
 * */
public class Case3 {

	public static void main(String[] args) {
		
		double[] stocks = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};  
		double[] bonds = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
		Calc calc = new Calc();
		double stock_cv = calc.getCV(stocks); 
		double bond_cv = calc.getCV(bonds);
		System.out.println("股票 CV: " + stock_cv);
		System.out.println("債券 CV: " + bond_cv);
		String result = stock_cv < bond_cv?"股票":"債券";
		System.out.println(result + "投資較為穩健");
	}
}
