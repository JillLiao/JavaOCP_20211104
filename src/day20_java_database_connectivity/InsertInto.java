package day20_java_database_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertInto {

	public static void main(String[] args) throws Exception {
		String sql ="INSERT INTO Department (name) VALUES(?)";
		Class.forName("org.sqlite.JDBC");
		//因為Connection有實作一個自動關閉(AutoCloseable)的interface
		//這時只要將Connection放到try的()裡，當try-catch指令結束後，會自動執行colse()的動作
		//連Statement一起放進來，之後也可以自動關閉資源
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:database/my_javadb.db");
			 PreparedStatement pstmt = conn.prepareStatement(sql);){
			
			pstmt.setString(1, "IT"); //上面的String sql中第一個 ? 放 "IT"
//			pstmt.setString(1, "Sales"); //這兩行新增的資料必須分開執行，否則他就只會新增最後一行的資料
			int rowcount = pstmt.executeUpdate(); //執行更新，並得到有幾筆資料異動
			System.out.println("執行【新增】指令，共有"+ rowcount +"筆資料受到影響");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
