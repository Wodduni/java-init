package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
	
		try {
			Connection conection = DBCon.getCon();
			String sql = "SELECT * FROM USER_INFO";
			Statement statement = conection.createStatement();
			ResultSet rSet = statement.executeQuery(sql);
			while(rSet.next()) {
				String uiId = rSet.getString("UI_ID");
				String uiPwd = rSet.getString("UI_PWD");
				String uiName = rSet.getString("UI_NAME");
				int uiNum = rSet.getInt("UI_NUM");
				System.out.print("UI_ID : " + uiId + ", ");
				System.out.print("UI_NUM : " + uiNum+ ", ");
				System.out.print("UI_NAME : " + uiName+ ", ");
				System.out.print("UI_PWD : " + uiPwd+ ", ");
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
