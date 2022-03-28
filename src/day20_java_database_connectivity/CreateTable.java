package day20_java_database_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		// 建立資料表-Department
		String sql = "create table Department(" + "id integer primary key autoincrement, " + "name text " + ")";
		System.out.println(sql);
		// 1. 註冊 sqlite 驅動程式
		Class.forName("org.sqlite.JDBC");
		// 2. 建立連線物件 (開啟與資料庫的連線)
		Connection conn = DriverManager.getConnection("jdbc:sqlite:database/my_javadb.db");
		// 3. 建立 statement 敘述物件
		// 注意! 這裡要import java.sql.Statement!不要import成beans的Statement
		Statement stmt = conn.createStatement();
		// 4. 執行 sql 語句
		boolean return_value = stmt.execute(sql);
		// 若下達是 sql 查詢指令則會得到 true, 反之得到 false
		//由於Create不是查詢指令，因此應會得到false的結果
		System.out.println(return_value);
		// 手動關閉資源; 若要讓電腦自動關閉資源，Java 7之後的版本可以將conn放進try裡面 (詳參InsertInto)
		stmt.close();
		conn.close();
	}

}
