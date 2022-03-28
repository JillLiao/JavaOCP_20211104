package day18_function_exception.error_handle;

public class _8_CallStackDemo {

	public static void main(String[] args) {
		System.out.println("執行 main()");		//請觀察執行後的錯誤連鎖反應，會層層反映出錯誤的發生地點
		a();									//錯誤發生後，會從程式最末端往前丟，看前面的程式有沒有人可以處理
	}											//若一路丟到最上層，都沒有程式去處理，最後就是JVM接手，停止程式並拋出錯誤訊息
												//這一個錯誤層層向上丟的過程就叫做【Call Stack Mechanism】
	public static void a() {
		System.out.println("執行 a()");
		b();
	}
	
	public static void b() {
		System.out.println("執行 b()");
		c();
	}

	public static void c() {
		System.out.println("執行 c()");
//		System.out.println(10/0); // 產生一個錯誤
		
	}
}
