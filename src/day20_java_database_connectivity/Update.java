package day20_java_database_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) throws Exception {
		String sql = "UPDATE Department SET name=? WHERE id=?";
		Class.forName("org.sqlite.JDBC");

		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:database/my_javadb.db");
				PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, "Account");//sql指令中第一個?填入"Account"
			pstmt.setInt(2, 3);//sql指令中第2個?填入3
			int rowcount = pstmt.executeUpdate(); // 執行更新並得到異動筆數
			System.out.println("執行【修改】指令，共有"+ rowcount +"筆資料受到影響");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
