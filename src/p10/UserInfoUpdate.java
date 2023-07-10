package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserInfoUpdate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID : ");
		String uiId = scanner.nextLine();
		
		try {
			Connection connection = DBCon.getCon();
			Statement statement = connection.createStatement();
			String sql = "SELECT UI_ID FROM USER_INFO WHERE UI_ID = '" + uiId +"'";
			ResultSet resultSet = statement.executeQuery(sql);
			if (resultSet.next()) {
				try {
					System.out.println("변경할 이름 : ");
					String uiName = scanner.nextLine();
					String sql1 = "UPDATE user_info\r\n "
							+ " SET UI_NAME='"+ uiName +"'"
							+ " WHERE UI_ID='" + uiId +"'" ;
					statement.executeUpdate(sql1);
					
					System.out.println("이름 변경 선공!!");
				} catch (Exception e) {
					
				}
				
			}else {
				System.out.println("그런 아이디 없다");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
