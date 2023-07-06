package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("name", "서울");
		map.put("age", "20");
		map.put("address", "서울");
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("name", "Lee");
		map1.put("age", "11");
		map1.put("address", "서울");
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("name", "Kim");
		map2.put("age", "50");
		map2.put("address", "서울");
		
		Map<String, String> map3 = new HashMap<>();
		map3.put("name", "Park");
		map3.put("age", "35");
		map3.put("address", "서울");
		
		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(map);
		mapList.add(map1);
		mapList.add(map2);
		mapList.add(map3);
		System.out.println(mapList);
	}
}
