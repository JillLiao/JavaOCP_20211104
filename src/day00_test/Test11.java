package day00_test;

public class Test11 {

	public static void main(String[] args) {
		Object exe = new String("10");
		Plus(exe);
		System.out.println("--------------------");
		System.out.printf("Plus(exe)= %s\n", Plus(exe));
		//方法運算結果為11，表示運算確實成立且結果順利return回來。
		//輸出exe內容仍為10，但finally確實執行了，因此判斷java方法為傳值
		System.out.printf("exe= %s\n", exe);
		
		System.out.println("--------------------");
		StringBuilder str = new StringBuilder("Hello ");
		Plus_2(str);
		System.out.println(str);
		//與上述結論有衝突，因為str物件作為引數，進入方法後，其本體內容確實地被修改了
		//問題: 1.Java的方法引數為物件時，是傳值還是傳址?
		//	   2.若為相互混用的狀況，什麼時候為傳值，什麼時候為傳址?
	}
	
	public static Object Plus(Object input ) {
		try {
			 Object rtInput1 = Integer.valueOf((String)input)+1;	//return = input +1
			 System.out.printf("try--rtInput = %s\n",rtInput1);
			 return rtInput1;
		} 
		finally{
			Object rtInput2 = Integer.valueOf((String)input)+2;
			System.out.printf("finally--rtInput= %s\n",rtInput2);
			
			input = rtInput2;
		}
	 }
	
	public static void Plus_2(StringBuilder input) {
		input.append("World!");
	}

}
