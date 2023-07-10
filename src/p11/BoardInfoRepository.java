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

public class BoardInfoRepository {
	public List<Map<String, String>> getBordList(Map<String, String> boardInfo){
		Connection connection = DBCon.getCon();
		try {
			Statement statement = connection.createStatement();
			String sqlString = "SELECT * FROM BOARD_INFO ";
			if (boardInfo != null) {
				if (boardInfo.get("title") !=null) {
					sqlString += "WHERE BI_TITLE LIKE '%"+boardInfo.get("title")+"%'";
				}
			}
			ResultSet resultSet = statement.executeQuery(sqlString);
			List<Map<String, String>> boardList = new ArrayList<>();
			while (resultSet.next()) {
				Map<String, String> boardMap = new HashMap<>();
				boardMap.put("biNum", resultSet.getString("BI_NUM"));
				boardMap.put("biTitle", resultSet.getString("BI_TITLE"));
				boardMap.put("biContent", resultSet.getString("BI_CONTENT"));
				boardMap.put("biWriter", resultSet.getString("BI_WRITER"));
				boardMap.put("biCredat", resultSet.getString("BI_CREDAT"));
				boardMap.put("biCnt", resultSet.getString("BI_CNT"));
				boardList.add(boardMap);
			}
			return boardList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int insertBoardInfo(/*Map<String, String> boardInfo*/) {
		Connection connection =DBCon.getCon();
		try {
			Statement statement = connection.createStatement();
			String sqlString = "INSERT INTO BOARD_INFO(BI_TITLE, BI_CONTENT, BI_WRITER, BI_CREDAT, BI_CNT) "
					+ "VALUES('두번째 게시물', '냉무', 'WONJOON', NOW(), 0)";
			int result = statement.executeUpdate(sqlString);
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public int deleteBoardInfo() {
		Connection connection =DBCon.getCon();
		try {
			Statement statement = connection.createStatement();
			String sqlString = "DELETE FROM BOARD_INFO WHERE BI_NUM = '" + 2 + "'";
			int result = statement.executeUpdate(sqlString);
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public int updateBoardInfo(Map<String, String> boardInfo) {
		Connection connection = DBCon.getCon();
		
		try {
			Statement statement = connection.createStatement();
			
			if (boardInfo != null) {
				String sqlString = "UPDATE BOARD_INFO SET ";
				if (boardInfo.get("biTitle") != null) {
					sqlString += " BI_TITLE = '" + boardInfo.get("biTtlte") + "',";
				}if (boardInfo.get("biContent") != null) {
					sqlString += " BI_CONTENT = '" + boardInfo.get("biContent") + "',";
				}if (boardInfo.get("biWriter") != null) {
					sqlString += " BI_WRITER = '" + boardInfo.get("biWriter") + "',";
				}if (boardInfo.get("biCnt") != null) {
					sqlString += " BI_CNT = '" + boardInfo.get("biCnt") + "',";
				}
				sqlString = sqlString.substring(0, sqlString.length()-1);
				sqlString += " WHERE BI_NUM=" + boardInfo.get("biNum");
				return statement.executeUpdate(sqlString);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		BoardInfoRepository boardInfoRepository = new BoardInfoRepository();
		Map<String, String> boardInfoMap = new HashMap<>();
//		boardInfoMap.put("title", "첫");
//		System.out.println(boardInfoRepository.getBordList(boardInfoMap));
		
//		System.out.println("row cnt : " + boardInfoRepository.insertBoardInfo());
//		System.out.println("row cnt : " +boardInfoRepository.deleteBoardInfo());
		
		Map<String, String> boardInfo = new HashMap<>();
		boardInfo.put("biNum", "1");
		boardInfo.put("biCnt", "1");
		int result = boardInfoRepository.updateBoardInfo(boardInfo);
		System.out.println("excute result : " + result);

		
	}
}
