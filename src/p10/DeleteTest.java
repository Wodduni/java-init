package p10;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3307/kd","root","kd1824java");
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM USER_INFO WHERE UI_NUM = 6";
			int resultCnt = statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
