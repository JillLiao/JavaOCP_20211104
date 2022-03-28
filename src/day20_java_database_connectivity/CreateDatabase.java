package day20_java_database_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateDatabase {

	public static void main(String[] args) throws Exception{
		// 建立資料庫:
		// 1. 註冊 sqlite 驅動程式
		//    forName()裡面要放資料庫驅動程式的名字，可以依下述步驟尋找: Maven Dependencies →　點開JDBC的jar 
		//    → 點開META-INF → 點開services → 點開java.sql.Driver檔 → 複製路徑，貼到forName()裡
		Class.forName("org.sqlite.JDBC");	//建立時會產生Exception，可以try-catch或拋出例外
		
		// 2. 建立連線物件 (開啟與資料庫的連線)
		//    DriverManager.getConnection()裡面是放一串String，前面兩項是固定的
		//    jdbc : [資料庫產品名] : [db source folder name]/ [database name].db
		// ※若指定連線的資料庫不存在，經過此步驟後會直接建立出一個指定名稱的資料庫
		// ※若是要連入在Server中的資料庫，需要帶帳號、密碼的話，Connection要這樣寫 ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
//   DriverManager.getConnection("jdbc : [資料庫產品名] : [db source folder name]/ [database name].db", "username", "password");
		Connection conn = DriverManager.getConnection("jdbc:sqlite:database/my_javadb.db");
		// 3. 查看是否連線已經關閉 ?
		System.out.println("連線是否已關閉:" + conn.isClosed());

		// 關閉連線
		conn.close();
		System.out.println("連線是否已關閉:" + conn.isClosed());
	}
	/*
	 * 1. JDBC是一種用於執行SQL的API，它本身是一個interface，Java只負責定義規格，而"實作"的工作則由我們去資料庫廠商(第三方; vendor)
	 * 	  下載(註冊)相應的Driver。
	 * 2. 使用JDBC的好處是，即便日後更換資料庫，因為都還是使用同一個interface，所以程式碼都不需要更動。
	 * 3. 有時系統會同時使用不同廠牌的資料庫，這些資料庫都有自己的Driver，因此會有一個DriverManager進行管理，Connection就是跟
	 * 	  DriverManager 進行連線，以連接各個資料庫。
	 * 4. Statement是用來存放SQL指令的地方，可分為三大類: (1)PreparedStatement  (2)Statement  (3)CallableStatement
	 * 5. 在Java的平台編寫SQL命令時，Compiler不會對 SQL debug，這些SQL命令對Java而言只是一個字串，Java只負責將這些指令丟給資料庫，
	 * 	  最終的執行結果是看資料庫如何解讀SQL命令，最後回傳的結果會是一個ResultSet。
	 * 6. 首先載入SQLite maven JDBC，之後再專案的下方建立source folder
	 * 7. 讓我們能看到資料庫內容，並使我們易於操作、管理資料庫的工具，稱為ViewEnvironmentClient
	 * 
	 * */
}
