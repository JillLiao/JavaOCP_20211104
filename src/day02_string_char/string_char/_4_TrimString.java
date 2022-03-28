package day02_string_char.string_char;

public class _4_TrimString {

	public static void main(String[] args) {
		String a = "abc";
		String s = "  abc  ";
		System.out.println(s);
		System.out.println(s.length());
		s = s.trim().intern(); // trim()會 return一個去除空白的 new String()
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s==a);

	}

}
