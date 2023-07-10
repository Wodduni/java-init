package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3307/kd", "root", "kd1824java");
			String sql = "\r\n"
					+ "UPDATE user_info\r\n"
					+ "SET UI_NAME='동동이'\r\n"
					+ "WHERE UI_NUM=9";
			Statement statement = connection.createStatement();
			int resultCnt = statement.executeUpdate(sql);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
