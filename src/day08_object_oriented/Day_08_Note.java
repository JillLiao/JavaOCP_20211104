package day08_object_oriented;

public class Day_08_Note {
/*
 * 一、存取權限：
 *		1.public:權限開放，皆可存取
 *		2.protected: (1)同package皆可存取
 *					 (2)不同package要繼承曾能存取
 *		3.無修飾字: 同package才能存取
 *		4.private: 同class才可以存取
 *		
 *		※class的存取權限只有【public】、【無修飾字】二種，
 *		 屬性、方法的存取權限就4種都有
 * 
 * 
 * 二、覆寫(Override)、多載(Overloading)、遮蔽(Shadow)的差異
 * 		---------------------------------------------------------------------------------------------
 * 			  是否需有
 * 			  繼承關係？	作用對象				定義					使用規則
 * 		---------------------------------------------------------------------------------------------
 * 		覆寫		 Y		父類別的方法		用和父類別相同的方法名稱	1.方法名稱、參數數量、參數型別與順序都要相同	
 * 										建立自己的方法			2.覆寫的方法權限只能>=父方法的權限
 * 															3.回傳值(void、int、Integer...)必須相同，
 *  														  或父方法【回傳值】的型別的子類別
 *  	---------------------------------------------------------------------------------------------
 * 		遮蔽		 Y		父類別的屬性		用和父類別相同的屬性名稱	  只要用相同的屬性名稱就能將父類別的屬性遮蔽掉
 * 						(變量、變數)		建立起自己的屬性			  ,但仍可透過super.呼叫父類別屬性
 * 		---------------------------------------------------------------------------------------------
 * 		多載		 Y/N	自身的建構子、方法	建立起多個名稱相同的方法	1.每一個方法名稱都必須相同
 * 						父類別的方法							2.每個方法的參數數量/順序、或data type回傳值必須不同
 * 															  簡言之，方法之間長相差異要大到足以讓電腦區分出來
 * 															3.開放權限的大小無法作為多載成立與否的要因
 * 		---------------------------------------------------------------------------------------------
 * 
 * 三、繼承關係下的建構子 (向上推定)
 * 		1.主方法在建立物件時，必先建立【父物件】才會建立【子物件】，因此【父建構子】會先執行，之後才會執行【子建構子】。
 * 		2.因為要先執行【父建構子】，所以不論【子建構子】參數、方法內容為何，就算沒有寫super()，【子建構子】中必定會隱含一個super()，
 * 		  先呼叫出並執行【父建構子】之後，才會接著做【子建構子】的內容。
 * 		3.super()就代表著繼承、向上找，因此必定要從【父建構子】中找到一個參數型別、數量、順序與【子建構子】相匹配者，
 * 		  否則繼承的要件不成立，出現編譯錯誤。
 * 		4.所以【父類別】的建構子數量必然>=【子類別】的建構子數量。
 * 
 * 四、繼承關係之下，資源調用寫法
 * 		--------------------------------------------
 * 		建構子調用		屬性調用			方法調用
 * 		--------------------------------------------
 * 		this()		this.money		this.submit()
 * 		super()		super.money		super.submit()
 * 		--------------------------------------------
 * 
 * 五、其他注意事項
 * 		1.this()、super()單獨出現時，必定在方法中的第一行，且二者不可同時存在同一個函式區塊
 * 		2.static方法中不可以有this()、super()、this.OO()、super.OO()，因為static方法無法建立物件，自然無法調用【建構子】
 * 		3.「成員變數」就是「物件變數」
 * */
}
