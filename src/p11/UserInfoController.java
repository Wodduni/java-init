package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInfoController {
	public List<Map<String,String>> getUserInfoList(Map<String, String> param){
		UserInfoService userInfoService = new UserInfoService();
		return userInfoService.getUserInfoList(param);
	}
	public int insertUserInfo(Map<String, String> userInfo) {
		UserInfoService userInfoService = new UserInfoService();
		
		return userInfoService.insertUserInfo(userInfo);
	}
	
	public int deleteUserInfo(Map<String, String> userInfo) {
		UserInfoService userInfoService = new UserInfoService();
		return userInfoService.deleteUserInfo(userInfo);
	}
	
	public static void main(String[] args) {
		UserInfoController userInfoController = new UserInfoController();
		Map<String, String> param = new HashMap<>();
		param.put("uiName", "Bo");
		List<Map<String,String>> userInfoList = userInfoController.getUserInfoList(param);
		
//		Scanner scanner = new Scanner(System.in);
//		String userInfo = scanner.nextLine();
//		String[] userInfos = userInfo.split(",");
//		Map<String, String> userInfosMap = new HashMap<>();
//		
//		userInfosMap.put("uiId", userInfos[0]);
//		userInfosMap.put("uiPwd", userInfos[1]);
//		userInfosMap.put("uiName", userInfos[2]);
//		int result = userInfoController.insertUserInfo(userInfosMap);
//		System.out.println("row count : " + result);
		
		Map<String, String> userDeleteInfo = new HashMap<>();
		userDeleteInfo.put("uiId", "sldisk35");
		userInfoController.deleteUserInfo(userDeleteInfo);
		
//		for(Map<String, String> userInfo : userInfoList) {
//			System.out.println("Name : " + userInfo.get("uiName"));
//			System.out.println("ID : " + userInfo.get("uiId"));
//			System.out.println("Num : " + userInfo.get("uiNum"));
//			System.out.println("PWD : " + userInfo.get("uiPwd"));
//		}
		
	}
}
