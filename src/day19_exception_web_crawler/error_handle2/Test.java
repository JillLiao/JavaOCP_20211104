package day19_exception_web_crawler.error_handle2;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Test {

	/*
	sno(站點代號)、sna(中文場站名稱)、tot(場站總停車格)、sbi(可借車位數)、
	sarea(中文場站區域)、mday(資料更新時間)、lat(緯度)、lng(經度)、ar(中文地址)、
	sareaen(英文場站區域)、snaen(英文場站名稱)、aren(英文地址)、bemp(可還空位數)、
	act(場站是否暫停營運)
	*/
	public static void main(String[] args) throws IOException {
		
		String data = getWebData();
		//1. getWebData()方法有拋出一個例外，因此呼叫時應該要在這裡catch接起來，但課程中為節省時間，所以索性不處理再繼續往上拋出例外
		//	 不用處理例外或錯誤當然很爽快，但一般在實務上，不可以這樣亂拋錯誤...
		//2. 由於桃市府Youbike網站提供的Json格式很奇怪，它不是一個陣列，且還包含自定義之內部類別，因此這裡無法在用之前『不合格米』案例
		//	 使用的Gson承接資料了 
		JsonElement jelement = JsonParser.parseString(data);
		System.out.println("data的資料: "+data);
		//接住網路的資料後，要想辦法取得裡面的物件，所以接著使用JsonObject
		JsonObject root = jelement.getAsJsonObject();	//root印出來後長得有點像是被打平的Json資料
		JsonObject retVal = root.getAsJsonObject("retVal");
//		System.out.println("retVal後的資料: "+retVal);
		//這次網路資料層層包裹，retCode{ retVal{ 裡面的資料才是我們要的，而且retVal裡的資料長得比較像物件 "":{}, "":{}, "":{},...
		//補充1. JsonObject的API → new LinkedTreeMap <String, JsonElement>(); 長相正好就是我們需要的資料"":{}, "":{}, "":{},...
//		for(int i=2001;i<=2425;i++) {
//			JsonObject station = retVal.getAsJsonObject(i+"");
//			if(station != null) {
//				String sna = station.get("sna").getAsString();
//				if(sna.contains(keyword)) {
//					System.out.println(station);
//				}
//			}
//		}
	}
	
	public static void findSbiAndBemp(int my_sbi, int my_bemp) throws IOException {
		String data = getWebData();
		JsonElement jelement = JsonParser.parseString(data);
		JsonObject root = jelement.getAsJsonObject();
		JsonObject retVal = root.getAsJsonObject("retVal");
		for(int i=2001;i<=2425;i++) {
			JsonObject station = retVal.getAsJsonObject(i+"");
			if(station != null) {
				int sbi = station.get("sbi").getAsInt();
				int bemp = station.get("bemp").getAsInt();
				if(sbi >= my_sbi && bemp >= my_bemp) {
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
}
