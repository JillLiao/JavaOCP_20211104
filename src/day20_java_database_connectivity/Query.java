package day20_java_database_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query {

	public static void main(String[] args) throws Exception{
		// 建立資料表-Department
		String sql = "SELECT id, name FROM Department";
		System.out.println(sql);
		// 註冊 sqlite 驅動程式
		Class.forName("org.sqlite.JDBC");

		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:database/my_javadb.db");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			System.out.println("+--------+------------+");
			System.out.println("|   id   |    name    |");
			System.out.println("+--------+------------+");
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.printf("| %6d | %-10s |\n", id, name);
				System.out.println("+--------+------------+");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
