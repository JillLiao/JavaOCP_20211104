package day19_exception_web_crawler.error_handle2;

public class _2_Rice {
	String Title;
	String 編號;
	String 品名;
	String 國際條碼;
	String 廠商名稱;
	String 廠商地址;
	String 檢驗結果;
	String 不合格原因;
	String 違反規定;
	String 行政處分;
	String Log_UpdateTime;
	//以上變數取自網路爬蟲抓下來的資料token，可以不用全部加，所以可以試著將其中幾項註解掉
	
	@Override
	public String toString() {
		return "_2_Rice [Title=" + Title + ", 編號=" + 編號 + ", 品名=" + 品名 + ", 國際條碼=" + 國際條碼 + ", 廠商名稱=" + 廠商名稱 + ", 廠商地址="
				+ 廠商地址 + ", 檢驗結果=" + 檢驗結果 + ", 不合格原因=" + 不合格原因 + ", 違反規定=" + 違反規定 + ", 行政處分=" + 行政處分
				+ ", Log_UpdateTime=" + Log_UpdateTime + "]";
	}
	
}
