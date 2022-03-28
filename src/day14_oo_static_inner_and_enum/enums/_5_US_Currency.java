package day14_oo_static_inner_and_enum.enums;

public enum _5_US_Currency {
	
	PENNY(1), NICKEL(5), DIME(10), QUARTER(25); //這列每個元素都代表著一個enum的建構式，可以協助呼叫建構子
	
	private int value;
	
	//必須使用private
	private _5_US_Currency (int value) {	//為了不讓USER亂輸入value值，因此須將存取權限設為private
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
