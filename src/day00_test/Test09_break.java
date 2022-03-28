package day00_test;

public class Test09_break {

	public static void main(String[] args) {
		//一個break就只能打破一層迴圈
		for(int i=0;;i++) {
			for(int k=0;;k++) {
				if(k==10) {
					break;
				}
				System.out.println("內層");
			}
			System.out.println("外層");
		}
	}

}
