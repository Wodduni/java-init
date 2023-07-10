package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID : ");
		String uiId = scanner.nextLine();
		System.out.println("PW : ");
		String uiPwd = scanner.nextLine();
		
		try {
			Connection conection = DBCon.getCon();
			Statement statement = conection.createStatement();
			String sql = "SELECT * FROM user_info";
			sql += ""
					+ " WHERE UI_ID = '"+ uiId + "' AND UI_PWD = '" + uiPwd + "'";
			ResultSet rSet = statement.executeQuery(sql);
			if (rSet.next()) {
				String uiName = rSet.getString("UI_NAME");
				System.out.println(uiName +" Login succesed");
			}else {
				System.out.println("Login Failed");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
//String sql = "SELECT * FROM user_info";
//sql += "WHERE UI_ID = '"+ uiId + "' AND UI_PWD = '" + uiPwd + "'";