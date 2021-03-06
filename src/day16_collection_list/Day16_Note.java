package day16_collection_list;

public class Day16_Note {
/*
 * 1. Set沒有維度，所以一定要按順序尋訪(next)。List有維度，因此ListIterator可以往下(next)、往上(previous)
 * 2. ArrayList就是動態陣列
 * 3. 
 * ----------------------------------------------------------------
 * 				執行序安全			
 * ----------------------------------------------------------------
 * ArrayList	no
 * 				適合單工
 * ----------------------------------------------------------------
 * Vector		yes
 * 				獨佔型，適合多工
 * ----------------------------------------------------------------
 * 
 * 4. Vector (向量?) 因為可以多工，故其使用得非常廣泛，尤其在網路世界可公開查詢、存取的資料，在唯讀時非常好用，缺點是牽涉到修改時就會很麻煩了
 * 
 * 5.看到Linked這個關鍵字，代表這個集合是以元素加入的順序輸出資料
 * 
 * 6. Collections是工具類別，用來呼叫諸如Collections.reverse()、Collections.shuffle()
 * 		Collection 則是用來進行宣告的interface
 * 
 * 
 * */
}
