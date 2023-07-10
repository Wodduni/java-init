package p11;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBCon;

public class UserInfoRepository {
	public List<Map<String, String>> getUserInfoList(Map<String, String> param) {
		List<Map<String, String>>userInfoList = new ArrayList<>();
		Connection connection = new DBCon().getCon();
		try {
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM USER_INFO";
			if (param != null) {
				if (param.get("uiName") != null) {
					sql += " WHERE UI_NAME LIKE '%" + param.get("uiName") + "%'";
				}
				
			}
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				Map<String, String>userInfoMap = new HashMap<>();
				userInfoMap.put("uiNum", resultSet.getString("UI_NUM"));
				userInfoMap.put("uiId", resultSet.getString("UI_ID"));
				userInfoMap.put("uiPwd", resultSet.getString("UI_PWD"));
				userInfoMap.put("uiName", resultSet.getString("UI_NAME"));
				userInfoList.add(userInfoMap);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfoList;
	}
	
	public int insertUserInfo(Map<String, String> userInfo){
		Connection connection = DBCon.getCon();
		try {
			Statement statement = connection.createStatement();
			String sqlString = "INSERT INTO USER_INFO(UI_ID, UI_PWD, UI_NAME) VALUES('" + userInfo.get("uiName")+ "', '" + userInfo.get("uiDesc") + "', '" + userInfo.get("uiName") +  "')";
			int resultCnt = statement.executeUpdate(sqlString);
			return resultCnt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteUserInfo(Map<String, String> userInfo) {
		Connection connection = DBCon.getCon();
		try {
			Statement statement = connection.createStatement();
			String sqlString = "DELETE FROM USER_INFO WHERE UI_ID = '" + userInfo.get("uiId")+ "'";
			int resultCnt = statement.executeUpdate(sqlString);
			return resultCnt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
