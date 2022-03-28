package day10_object_oriented;

public class _06_MyPhone implements _05_Phone {
	
	private String number;
	
	@Override
	public void dial() {
		if(number != null && number.length() == 10) {
			System.out.printf("%s 開始撥號...\n", number);
		} else {
			System.out.println("請先設定合法手機號碼");
		}
	}

	@Override
	public void setNumber(String number) {
		if(number != null && number.length() == 10) {
			this.number = number;
		} else {
			System.out.println("手機號碼設定錯誤");
		}
	}

	@Override
	public String getNumber() {
		return number;
	}
}
