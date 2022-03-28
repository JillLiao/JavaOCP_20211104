package day19_exception_web_crawler.error_handle2;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class _3_WebCrawlerYoubike {
	/*
	sno(站點代號)、sna(中文場站名稱)、tot(場站總停車格)、sbi(可借車位數)、
	sarea(中文場站區域)、mday(資料更新時間)、lat(緯度)、lng(經度)、ar(中文地址)、
	sareaen(英文場站區域)、snaen(英文場站名稱)、aren(英文地址)、bemp(可還空位數)、
	act(場站是否暫停營運)
	*/
	public static void main(String[] args) throws IOException {
		findSbiAndBemp(40, 40);
		findSna("火車");
	}
	
	public static void findSna(String keyword) throws IOException {	//此方法簽章處拋出的例外是承接自getWebData()的例外
		String data = getWebData();
		//1. getWebData()方法有拋出一個例外，因此呼叫時應該要在這裡catch接起來，但課程中為節省時間，所以索性不處理再繼續往上拋出例外
		//	 不用處理例外或錯誤當然很爽快，但一般在實務上，不可以這樣亂拋錯誤...
		//2. 由於桃市府Youbike網站提供的json格式很奇怪，它不是一個陣列，且還包含自定義之內部類別，因此這裡無法在用之前『不合格米』案例中
		//	 使用的Gson物件承接資料，需使用gson的其他API
		
		//-----------以下詳列本案的coding步驟說明-------------
		
		//1. 為了能使用gson套件的其他API，要先用抽象類別JsonElement宣告變數，再利用 JsonParser 裡的 parseString()方法接住
		//	 【String型別的json資料】，再回傳【JsonElement的分析樹 (parse tree)】
		//※疑問1: 什麼是parse tree?
		//※疑問2: 變數? v.s. 物件?
		JsonElement jelement = JsonParser.parseString(data);
		
		//2. 然後，用 JsonObject 宣告變數 root，用剛剛被宣告為JsonElement的 jelement 變數，呼叫出 getAsJsonObject()，
		//	 這時因為是呼叫 JsonElement 的 getAsJsonObject()，所以還無法放參數進去，印出root後可以先觀察資料目前的結構，
		//	 長得有點像剝掉最外層{}後被打平的json資料　→　 "":{},"":{},"":{},...
		//	 可以觀察到所有我們想要查詢的資料都被包裹在 "retVal":{ 我們想要的資料 } 這個member中
		JsonObject root = jelement.getAsJsonObject();
		
		//3. 觀察完資料就可以接著處理資料了，JsonObject會做出一個 LinkedTreeMap <String, JsonElement> 來接資料，
		//	 這時用被宣告為 JsonObject 的 root 就可以使用帶參數的 getAsJsonObject() 了。
		//	 getAsJsonObject()可以取得參數名稱後方的JsonElement，並以JsonObject的型別再傳回來，我們可以藉由這個
		//	 方法獲得這些被層層包裹的資料。
		//	 ※順帶一提，步驟3呼叫的 getAsJsonObject() 是來自 JsonObject 類別；
		//	          步驟2呼叫的 getAsJsonObject() 是來自 JsonElement 抽象類別，因此用法不同。
		JsonObject retVal = root.getAsJsonObject("retVal");
		
		//4. 獲得包裹在內層的資料後，可以看到每一站(station)的代碼皆為String數字，並且編號在2001~2425之間
		//	 所以接下來就可以用for迴圈將裡面的資料拉出來。
		for(int i=2001;i<=2425;i++) {
			JsonObject station = retVal.getAsJsonObject(i+""); //(i+"")將迴圈的變數i傳盛String才可以進getAsJsonObject()裡
			if(station != null) {	//排除UBike車站代碼跳號的狀況
				String sna = station.get("sna").getAsString();	//取得中文UBike站名
				if(sna.contains(keyword)) {
					System.out.println(station);
				}
			}
		}
	}
	
	public static void findSbiAndBemp(int my_sbi, int my_bemp) throws IOException {
		String data = getWebData();
		JsonElement jelement = JsonParser.parseString(data);
		JsonObject root = jelement.getAsJsonObject();
		JsonObject retVal = root.getAsJsonObject("retVal");
		for(int i=2001;i<=2425;i++) {
			JsonObject station = retVal.getAsJsonObject(i+"");
			if(station != null) {
				int sbi = station.get("sbi").getAsInt();	//取得可借車數
				int bemp = station.get("bemp").getAsInt();	//取得可還車數
				if(sbi >= my_sbi && bemp >= my_bemp) {		//可借、可還數量大於設定值，再將車站名印出
					System.out.println(station);
				}
			}
		}
	}
	
	public static String getWebData() throws IOException {	//雖然下方有2個物件會拋出例外，理應用catch接起來，但不想維護錯誤的話
													//就在方法簽章這裡拋出2種例外的共同(父)類別，由其他呼叫此方法的程式去接住例外
		String path = "https://data.tycg.gov.tw/opendata/datalist/datasetMeta/"
				+ "download?id=5ca2bfc7-9ace-4719-88ae-4034b9a5a55c&rid="
				+ "a1b4714b-3b75-4ff8-a8f2-cc377e4eaa0f";
		
		URL url = new URL(path);	//原本URL物件會拋出一個【MalformedURLException】例外
		Scanner sc = new Scanner(url.openStream()).useDelimiter("\\A");	//原本url.openStream()會拋出 IOException
		return sc.next();
	}
/*
 * 												 <Abstract>
 * 											+-------------------+
 * 											|    JsonElement    |
 * 											+-------------------+
 * 											|                   |
 * 											+-------------------+
 * 											| +getAsJsonObject()|
 * 											+-------------------+
 * 													   ↑
 * 													   |
 * 		+---------------------------+		+----------------------------------------------+
 * 		|        JsonParser         |		|                  JsonObject                  |
 * 		+---------------------------+		+----------------------------------------------+
 * 		|                           |		| -members: LinkedTreeMap<String, JsonElement> |
 * 		+---------------------------+		+----------------------------------------------+
 * 		| +parseString(String json) |		| +getAsJsonObject(String: member name)        |
 * 		|    return JsonElement	    |		+----------------------------------------------+
 * 		+---------------------------+		
 * 
 * */
}
