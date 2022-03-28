package day19_exception_web_crawler.homework;

public class Ubike_Main {
//回家作業: 利用大圓距離公式找出【座標】方圓200公尺內的 Ubike 車站資訊
	public static void main(String[] args) {
		WebCrawler_Ubike.findStation(24.989919, 121.311884, 300);	//( 座標緯度, 座標經度, 距離設定[公尺] )
	}

}
