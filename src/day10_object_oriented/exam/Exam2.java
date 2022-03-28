package day10_object_oriented.exam;

public class Exam2 {

	public static void main(String[] args) {
		
		String str = "Happy New Year And Merry Christmas";
		System.out.println(str);	//變數名稱太短有時候會無法提示
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		System.out.println(str);
		int end = str.indexOf(" ");//找空格在第幾個位置 0、1、2、3、4....
		System.out.println(end);//因為是從0開始算，所以【第一個空格所在的位置】的int值，正好是最後一個單字的長度

	}

}
