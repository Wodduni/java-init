package p10;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTEst {
	//전화기가 필요함.
	//유심칩
	//전화번호
	//인증절차
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mariadb://localhost:3307/kd", "root", "kd1824java");
			Statement statement =  DriverManager.getConnection("jdbc:mariadb://localhost:3307/kd", "root", "kd1824java").createStatement();
			String sql = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME)\r\n"
					+ "VALUES('TEST12', 'TEST', '연습')";
			int resultCnt =  DriverManager.getConnection("jdbc:mariadb://localhost:3307/kd", "root", "kd1824java").createStatement().executeUpdate(sql);
			System.out.println("반영된 행 갯수 : "+resultCnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
