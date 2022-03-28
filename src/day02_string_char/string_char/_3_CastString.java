package day02_string_char.string_char;

public class _3_CastString {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "JAVA";
		System.out.println(s1 == s2);
		
		s1 = s1.toUpperCase().intern(); // .intern() 是可以把字串放入到 String pool 中 "共用"
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
