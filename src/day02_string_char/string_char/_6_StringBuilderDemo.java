package day02_string_char.string_char;

public class _6_StringBuilderDemo {

	public static void main(String[] args) {
		
		//StringBuffer、StringBuilder用法是差不多的，只是StringBuffer用在多工，StringBuilder用在單工
		StringBuilder sb = new StringBuilder();	
		sb.append("Java").append("8");
		System.out.println(sb);
		
		String s = "";
		s = s.concat("Java").concat("8");
		System.out.println(s);

		
		// sb 與 s 內容相比 ?
		System.out.println( s.equals(sb) );
		System.out.println( s.equals(sb.toString()) ); // 將 sb 轉字串之後再比
	}

}
