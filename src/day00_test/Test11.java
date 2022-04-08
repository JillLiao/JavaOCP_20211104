package day00_test;

public class Test11 {
	
	public static Object Function_1(Object input ) {
		try {
			 Object rtInput1 = Integer.valueOf((String)input)+1;
			 System.out.printf("In Function_1 try block,  exe = %s\n",rtInput1);
			 return rtInput1;
		} 
		finally{
			Object rtInput2 = Integer.valueOf((String)input)+2;
			System.out.printf("In Function_1 finally block,  exe= %s\n",rtInput2);
			
			input = rtInput2;
		}
	 }
	
	public static void Function_2(StringBuilder input) {
		input.append("World!");		
	}
	
	public static void Function_3(String str) {
		str = str + " World!";
//		str = str.concat(" World!");
//		str.concat(" World!");
	}
	
	public static void main(String[] args) {
		Object exe = new String("10");
		
		System.out.printf("Use Function_1,  exe = %s\n", Function_1(exe));
		//第一行輸出結果為11，表示運算確實成立且結果順利return回來。
		//第二行輸出結果為12，表示finally確實執行了。
		System.out.printf("After Function_1,  exe= %s\n", exe);
		//執行完Function_1後再次確認exe值，並未如期在finally階段修改，因此判斷java方法為傳值。
		
		System.out.println("--------------------");
		
		StringBuilder str = new StringBuilder("Hello ");
		Function_2(str);
		System.out.println(str);
		//與上述結論有衝突，因為str物件作為引數，進入方法後，其本體內容確實地被修改了
		//問題: 1.Java的方法引數為物件時，是傳值還是傳址?
		//	   2.若為相互混用的狀況，什麼時候為傳值，什麼時候為傳址?
		
		System.out.println("--------------------");
		
		String str2 = new String("Hello");
		Function_3(str2);
		System.out.println(str2);
		//使用了void方法，結果引數為傳值，而非傳址。所以傳值/傳址跟方法是否return應沒有直接關係。
	}
}
