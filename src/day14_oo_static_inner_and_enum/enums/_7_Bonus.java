package day14_oo_static_inner_and_enum.enums;

public enum _7_Bonus {
	董事長(10, 10000), 副董事長(9, 9000), 總經理(8, 8000), 
	副總經理(7, 7000), 協理(6, 6000), 經理(5, 5000), 
	副理(4, 4000), 襄理(3, 3000), 專員(2, 2000), 助理(1, 1000);
	
	private int value;
	
	// 建構子 private (position:職位, base:基數)
	private _7_Bonus(int position, int base) {
		this.value = position * base;
	}
	
	public int getValue() {
		return value;
	}
}
