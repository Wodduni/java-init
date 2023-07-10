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

public class ClassInfoRepository {
	public List<Map<String, String>> getClassList(Map<String, String> pram){
		ClassInfoService classInfoService = new ClassInfoService();
		List<Map<String, String>> classInfoList = new ArrayList<>();
		
		Connection connection = DBCon.getCon();
		try {
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM CLASS_INFO";
			if (pram != null) {
				if (pram.get("uiName") != null) {
					sql += " WHERE CI_NAME LIKE '%" + pram.get("uiName") + "%'";
				}
			}
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
				Map<String, String> classInfoMap = new HashMap<>();
				classInfoMap.put("uiNum",resultSet.getString("CI_NUM"));
				classInfoMap.put("uiName",resultSet.getString("CI_NAME"));
				classInfoMap.put("uiDesc",resultSet.getString("CI_DESC"));
				classInfoList.add(classInfoMap);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return classInfoList;
		
	}
	
	public int insertClassInfo(Map<String, String> classInfo){
		Connection connection = DBCon.getCon();
		try {
			Statement statement = connection.createStatement();
			String sqlString = "INSERT INTO CLASS_INFO(CI_NAME, CI_DESC) VALUES('" + classInfo.get("uiName")+ "', '" + classInfo.get("uiDesc") + "')";
			int resultCnt = statement.executeUpdate(sqlString);
			return resultCnt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	
}
