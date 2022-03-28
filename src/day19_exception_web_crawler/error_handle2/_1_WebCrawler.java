package day19_exception_web_crawler.error_handle2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;

public class _1_WebCrawler {	//網路爬蟲，本程式利用此技術將網路資料當成資料庫

	public static void main(String[] args) {
		String data = getWebData();
		_2_Rice[] rices= getRice(data);
		System.out.printf("資料筆數: %d\n", rices.length);
		Scanner sc= new Scanner(System.in);
		System.out.print("請輸入品名關鍵字: ");
		String keyword =sc.next();
		for (_2_Rice ric: rices) {	//用for-each迴圈，將帶有關鍵字的品項資料拉出來
			if(ric.品名.contains(keyword)) {
				System.out.printf("不合格品名: %s  不合格原因: %s\n",ric.品名,ric.不合格原因);
			}
		}
		sc.close();	//此物件為一個IO (input/output)，而IO通常應搭配一個close讓結束後將資源釋放，不close就會一直佔著資源
	}
	
	public static _2_Rice[] getRice(String jsonstr) {	//此方法用於建立Rice陣列
		Gson gson = new Gson();	//透過掛載gson這個library承接json格式的資料
		_2_Rice [] rices = gson.fromJson(jsonstr, _2_Rice[].class);
						//fromJson()的API已規定【參數1: String Json 資料】、【參數2: class】	
						//透過此方法，可將Json資料轉換成工程師指定的資料class
		return rices;
	}
	
	public static String getWebData() {
		String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
		String data = null;
		try {
			URL url = new URL(path);  //URL物件必定會拋出一個【URL格式錯誤】的例外，API上已經寫死了，所以加上try-catch
			Scanner sc = new Scanner(url.openStream()).useDelimiter("\\A"); 
			//1. url.openStream()必定會拋出一個【IOException】輸入/輸出異常，找不到資料的例外，所以下方一樣要用catch抓起來。
			//	 造成IOException有很多原因，可能是網站關閉、防火牆阻擋...
			//2. 之前都是寫Scanner(System.in)，表示為鍵盤輸入，但資料的輸入也可以是網路來源!
			//3. useDelimiter()是使用分段符號的意思，但由於我們沒有要將文字斷開，所以要用 \A 表示全選，但又因為 \ 是關鍵字，所以要寫成 \\A
			//	 https://reurl.cc/ak9XGZ   Oracle官網上表示 \A 是"The beginning of the input"
			//	 這裡使用useDelimiter()其實和分隔符號沒有關係，只是想要藉著此API將串流中的char陣列轉成String
			data = sc.next(); //.next()表示，讀進來的字串遇到空白就會停止讀取了，而nextLine()整行讀入
		} catch (MalformedURLException e) {
			System.err.println("網路連結格式錯誤:" + e);	//MalformedURLException(子類別) 繼承了 IOException(父類別)
		} catch (IOException e) {					//因此例外抓取 MalformedURLException 放上面
			System.err.println("無法找到資料:" + e);	//IOException 放下面
		}
		return data;
	}

}
