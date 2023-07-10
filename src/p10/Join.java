package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Join {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID : ");
		String uiId = scanner.nextLine();
		System.out.println("PW : ");
		String uiPwd = scanner.nextLine();
		System.out.println("NAME : ");
		String uiName = scanner.nextLine();
		
		try {
			Connection conection = DBCon.getCon();//전화기 들기
			Statement statement = conection.createStatement(); // 마리아DB 쿼리문 작성 하는 곳 연결
			String sql = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME) ";
			sql += " VALUES('"+uiId+"', '"+uiPwd+"', '" + uiName + "')";
			
			int resultCnt = statement.executeUpdate(sql);
			
			System.out.println(uiName + " 님 환영 합니다");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
