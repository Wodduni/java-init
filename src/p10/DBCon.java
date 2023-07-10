package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	
	private static final String DRIVER_CLASS = "org.mariadb.jdbc.Driver";
	private static final String URL_STRING = "jdbc:mariadb://localhost:3307/kd";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "kd1824java";
	
	static {
		//즉시 실행 영역
		try {
			Class.forName(DRIVER_CLASS);
			System.out.println("if I print nice connect driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		try {
			Connection connection = DriverManager.getConnection(URL_STRING, USERNAME, PASSWORD);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
