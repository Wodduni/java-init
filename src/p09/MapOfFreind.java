package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapOfFreind {
	public static void main(String[] args) {
		Map<String,String> mapOfFreind = new HashMap<>();
		mapOfFreind.put("name", "Bosung");
		mapOfFreind.put("sex", "Crayon");
		mapOfFreind.put("age", "25");
		mapOfFreind.put("height", "155");
		
		Map<String,String> mapOfFreind1 = new HashMap<>();
		mapOfFreind1.put("name", "Wang");
		mapOfFreind1.put("sex", "Crayon");
		mapOfFreind1.put("age", "30");
		mapOfFreind1.put("height", "176");
		
		Map<String,String> mapOfFreind2 = new HashMap<>();
		mapOfFreind2.put("name", "Dragon");
		mapOfFreind2.put("sex", "Android");
		mapOfFreind2.put("age", "20");
		mapOfFreind2.put("height", "173");
		
		Map<String,String> mapOfFreind3 = new HashMap<>();
		mapOfFreind3.put("name", "Dding");
		mapOfFreind3.put("sex", "Bayaba");
		mapOfFreind3.put("age", "15");
		mapOfFreind3.put("height", "180");
		
		Map<String,String> mapOfFreind4 = new HashMap<>();
		mapOfFreind4.put("name", "Wonkee");
		mapOfFreind4.put("sex", "A.I");
		mapOfFreind4.put("age", "85");
		mapOfFreind4.put("height", "175");
		
		List<Map<String,String>> listMapOfFriend = new ArrayList<>();
		listMapOfFriend.add(mapOfFreind);
		listMapOfFriend.add(mapOfFreind1);
		listMapOfFriend.add(mapOfFreind2);
		listMapOfFriend.add(mapOfFreind3);
		listMapOfFriend.add(mapOfFreind4);
		
		for (Map<String, String> it : listMapOfFriend  ) {
			System.out.println(it);
			
		}
		
		
	}
}
