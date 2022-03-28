package day10_object_oriented;

public interface _01_TV {
	String getResolution(); // 解析度
	void setVolume(int vol); // 設定音量
	int getVolume(); // 取得音量
	void powerOn(); // 開電視
	void powerOff(); // 關閉電視
	void setChannel(int no); // 選台
	int getChannel(); // 取得目前台號
}
