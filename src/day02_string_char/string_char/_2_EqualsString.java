package day02_string_char.string_char;

public class _2_EqualsString {

	public static void main(String[] args) {
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		// 比較 stack 的內容, 而非比較字串的內容
		System.out.println(s1 == s2);
		// 比較字串的內容
		System.out.println(s1.equals(s2));
		
		String s3 = new String("jAvA");
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3)); // 忽略大小寫比較
		
		System.out.println("-------------");

		String s4 = "Java";
		String s5 = "Java";
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));
		System.out.println(s1.equals(s5));
	}
}
