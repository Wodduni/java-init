package p11;

import java.beans.Statement;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import p10.DBCon;

public class ClassInfoController {
	public List<Map<String, String>> getClassInfo(Map<String, String> pram) {
		ClassInfoService classInfoService = new ClassInfoService();
		return classInfoService.getClassInfoList(pram);
	}
	
	public int insertClassInfo (Map<String, String> classInfo) {
		ClassInfoService classInfoService = new ClassInfoService();
		return classInfoService.insertClassInfo(classInfo);
	}
	public int deleteClassInfo(Map<String, String> classInfo) {
		ClassInfoService classInfoService = new ClassInfoService();
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("1. 출력");
		System.out.println("2. 입력");
		System.out.println("3. 삭제");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num == 1) {
			ClassInfoController classInfoController = new ClassInfoController();
			Map<String, String> pram = new HashMap<>();
			pram.put("uiName", "WON");
			List<Map<String, String>> classInfoList = classInfoController.getClassInfo(pram);
			System.out.println(classInfoList);
		}else if (num == 2) {
			System.out.println("uiName, uiDesc 입력");
			ClassInfoController classInfoController = new ClassInfoController();
			Map<String, String> classInfo = new HashMap<>();
			
			Scanner scanner1 = new Scanner(System.in);
			String classInfoString = scanner1.nextLine();
			String[] userInfos = classInfoString.split(",");
			
			classInfo.put("uiName", userInfos[0]);
			classInfo.put("uiDesc", userInfos[1]);

			int result = classInfoController.insertClassInfo(classInfo);
			System.out.println("row count : " + result);
		}else if (num == 3) {
			ClassInfoController classInfoController = new ClassInfoController();
			System.out.println("uiName 입력");
			Map<String, String> classInfo = new HashMap<>();
			
			Scanner scanner2 = new Scanner(System.in);
			String classInfoString = scanner2.nextLine();
			classInfo.put("uiName", classInfoString);
			
			int result = classInfoController.deleteClassInfo(classInfo);
			System.out.println("row count : " + result);
		}
	}
}
