package day16_collection_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _7_HashMapDemo {
//Java8之後的重要度提升，可用於群組的資料，資料分析時很重要
	
	public static void main(String[] args) {
//		Map<String, Integer> exams = new HashMap<>();		//注意entry排列的順序與LinkedHashMap不同
		Map<String, Integer> exams = new LinkedHashMap<>();
		exams.put("國文",100);
		exams.put("數學",100);
		exams.put("英文",95);
		System.out.println(exams);		//Map輸出時外層是被{}包圍，其他的集合或靜態陣列的資料都是用[]包裹
		
		//總共考了哪些科目?
		Set<String> subject = exams.keySet();	//利用 .keySet()將key取出，並回傳一個由Key組成的Set(因為不重複，所以是Set)
		System.out.println(subject);
		
		//請問數學幾分?
		System.out.println("數學的分數為: "+ exams.get("數學"));	//用key物件去搜尋其對應的value
		
		//請印出所有成績
			//方法1
			Collection<Integer> scores = exams.values();	//用 .values()將所有的values集合成一個Collection傳回來，
			System.out.println("所有科目的成績："+ scores);		//所以記得要宣告Collection，基本長得舊式List的模樣。
		
			//方法2 利用Stream的forEach。注意！這裡需要放一個與串流參數型別相應的Consumer
			exams.entrySet().stream().mapToInt(ex -> ex.getValue()).forEach(System.out::println);
		
		//請算出總分
		//方法1
		int sum = exams.entrySet().stream().mapToInt(e -> e.getValue()).sum();
		System.out.println("方法1 總分為："+sum);
		
		//方法2------------------------------
		int sum2 = 0;
		for(Integer s: scores ) {
			sum2 += s;
		}
		System.out.println("方法2 總分為："+sum2);
		
		//方法3------------------------------
		int sum3 = scores.stream().mapToInt(Integer::valueOf).sum();	//因為有auto-unboxing功能，所以這裡的Integer::valueOf
		System.out.println("方法3 總分為："+sum3);							//也可置換成 sc -> sc
		
		//方法4------------------------------
		int sum4 =0;
		List<Integer> score = new ArrayList<Integer>(exams.values());	//exams.values()出來是個Collection，ArrayList正好
		for(int i=0; i< score.size(); i++) {							//可以塞入Collection
			sum4 += score.get(i);	//因為只有List有 .get()，而Collection沒有，所以硬要使用get()去抓資料加總的話就只能用方法4
		}							//但其實這樣還挺拐彎抹角的，建議直接用stream
		System.out.println("方法4 總分為："+sum4);
	}

}
