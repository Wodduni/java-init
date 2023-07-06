package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class MapOfSong {
	public static void main(String[] args) {
		Map<String,String> mapSong = new HashMap<>();
		mapSong.put("Title", "AlwaysAwake");
		mapSong.put("Singer", "BeenZino");
		mapSong.put("Rank", "3");
		mapSong.put("Country", "Korea");
		
		Map<String,String> mapSong1 = new HashMap<>();
		mapSong1.put("Title", "OMG");
		mapSong1.put("Singer", "NewJeans");
		mapSong1.put("Rank", "2");
		mapSong1.put("Country", "Korea");
		
		Map<String,String> mapSong2 = new HashMap<>();
		mapSong2.put("Title", "shapeOfyou");
		mapSong2.put("Singer", "EdSheeran");
		mapSong2.put("Rank", "1");
		mapSong2.put("Country", "America");
		
		Map<String,String> mapSong3 = new HashMap<>();
		mapSong3.put("Title", "Peaches");
		mapSong3.put("Singer", "J.B");
		mapSong3.put("Rank", "5");
		mapSong3.put("Country", "America");
		
		Map<String,String> mapSong4 = new HashMap<>();
		mapSong4.put("Title", "HypeBoy");
		mapSong4.put("Singer", "NewJeans");
		mapSong4.put("Rank", "7");
		mapSong4.put("Country", "Korea");
		
		Map<String,String> mapSong5 = new HashMap<>();
		mapSong5.put("Title", "LikeAPool");
		mapSong5.put("Singer", "BeenZino");
		mapSong5.put("Rank", "8");
		mapSong5.put("Country", "Korea");
		
		List<Map<String,String>> listMapSong = new ArrayList<>();
		listMapSong.add(mapSong);
		listMapSong.add(mapSong1);
		listMapSong.add(mapSong2);
		listMapSong.add(mapSong3);
		listMapSong.add(mapSong4);
		listMapSong.add(mapSong5);
		
		for (Map<String, String> it : listMapSong  ) {
			System.out.println(it);
			
		}
	}
}
