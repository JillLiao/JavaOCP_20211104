package day19_exception_web_crawler.homework;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WebCrawler_Ubike {
	/*
	sno(站點代號)、sna(中文場站名稱)、tot(場站總停車格)、sbi(可借車位數)、
	sarea(中文場站區域)、mday(資料更新時間)、lat(緯度)、lng(經度)、ar(中文地址)、
	sareaen(英文場站區域)、snaen(英文場站名稱)、aren(英文地址)、bemp(可還空位數)、
	act(場站是否暫停營運)
	*/
	public static void findStation(double my_lat, double my_lng, double radius) {
		String data = getWebData();
		JsonElement jelement = JsonParser.parseString(data);
		JsonObject root = jelement.getAsJsonObject();
		JsonObject retVal = root.getAsJsonObject("retVal");
		
		for(int i=2001;i<=2425;i++) {
			JsonObject station = retVal.getAsJsonObject(i+"");
			if(station != null) {
				double lng = station.get("lng").getAsDouble();	//取得車站經度
				double lat = station.get("lat").getAsDouble();	//取得車站緯度
				double distance = GreatCircleDistance.algorithm(lng, lat, my_lng, my_lat);	//利用大圓公式計算距離
				if(distance <= radius) {
					System.out.printf("地點: %s, 距離: %.1f 公尺, 可借車位數: %d, 可還空位數: %d\n"
							,station.get("sna").getAsString()
							,distance
							,station.get("sbi").getAsInt()
							,station.get("bemp").getAsInt());
				}
			}
		}
	}
	
	public static String getWebData() {	//把資料抓下來
		String path = "https://data.tycg.gov.tw/opendata/datalist/datasetMeta/"
				+ "download?id=5ca2bfc7-9ace-4719-88ae-4034b9a5a55c&rid="
				+ "a1b4714b-3b75-4ff8-a8f2-cc377e4eaa0f";
		String data = null;
		try {
			URL url = new URL(path);
			Scanner sc = new Scanner(url.openStream()).useDelimiter("\\A");
			data = sc.next();
		} catch (MalformedURLException e) {
			System.err.println("網路連結格式錯誤:" + e);	//MalformedURLException(子類別) 繼承了 IOException(父類別)
		} catch (IOException e) {					//因此例外抓取 MalformedURLException 放上面
			System.err.println("無法找到資料:" + e);	//IOException 放下面
		}
		return data;
	}
}
