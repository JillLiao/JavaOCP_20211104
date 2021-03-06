package day17_lambda_function_stream;

public class Day17_Note {
/*
 * 一、Lambda 四大金剛
 * -----------------------------------------------------
 * 1. Consumer<T t>: 消費引數，丟進1個參數請他做事，不回傳值。
 * 2. Function<T t, R>: 函式，將參引數丟進去，回傳1個值。
 * 		BiFunction<T t,U u, R>:丟進2個值，回傳1個值。
 * 3. Predicate<T t>: 謂詞，丟進1個數值，回傳1個布林。
 * 4. Supplier<T t> : 不用給引數，接到命令後會自己丟出一個值出來。e.g. getTime();
 * -----------------------------------------------------
 * 
 * 二、什麼是Lambda?
 * 		Lambda是一種coding的寫法，在coding時可更加簡便的使用【運算式或Method】，不僅支援多工、還可以讓coding更加簡潔易閱讀。
 * 	但有使用條件，使用Lambda的時候，該Method必須是【Interface 中，唯一的 Method】！！！！
 * 	自行創造Lambda時，要將方法用四大金剛或相關的type進行宣告
 * 
 * 三、Lambda寫作方式
 * 	
 * 四、Stream
 * 	-------------------------------------------------------------------------
 * 		大分類					成員
 * 	-------------------------------------------------------------------------
 * 	Intermediate (中間流)			filter()、map()、peek() 
 * 	-------------------------------------------------------------------------
 * 	Terminal (終點流)				forEach()、count()、sum()、
 * 								average()、min()、max()、collect()
 * 	-------------------------------------------------------------------------
 * 	Terminal short-circuit		findFirst()、findAny()、 
 * 	(短路終點流)					anyMatch()、allMatch()、noneMatch()
 * 	-------------------------------------------------------------------------
 * 
 * 五、有關Stream
 * 	1. Stream 不是集合元素，它不是數據結構並不保存數據，它是有關算法和計算的，它更像一個高級版本的Iterator。
 * 
 * 
 * */
}
