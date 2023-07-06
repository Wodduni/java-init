package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapOfCountry {
	public static void main(String[] args) {
		Map<String, String> mapOfCountry = new HashMap<>();
		mapOfCountry.put("Name", "Korea");
		mapOfCountry.put("Continent", "Aisa");
		mapOfCountry.put("Population", "5000");
		mapOfCountry.put("Capital", "Seoul");
		
		Map<String, String> mapOfCountry1 = new HashMap<>();
		mapOfCountry1.put("Name", "Japan");
		mapOfCountry1.put("Continent", "Aisa");
		mapOfCountry1.put("Population", "4000");
		mapOfCountry1.put("Capital", "Tokyo");
		
		Map<String, String> mapOfCountry2 = new HashMap<>();
		mapOfCountry2.put("Name", "USA");
		mapOfCountry2.put("Continent", "NorthAmerica");
		mapOfCountry2.put("Population", "10000");
		mapOfCountry2.put("Capital", "W.D.C");
		
		Map<String, String> mapOfCountry3 = new HashMap<>();
		mapOfCountry3.put("Name", "Germany");
		mapOfCountry3.put("Continent", "Europe");
		mapOfCountry3.put("Population", "8000");
		mapOfCountry3.put("Capital", "Berlin");
		
		Map<String, String> mapOfCountry4 = new HashMap<>();
		mapOfCountry4.put("Name", "Maxico");
		mapOfCountry4.put("Continent", "SouthAmerica");
		mapOfCountry4.put("Population", "13000");
		mapOfCountry4.put("Capital", "MexicoCity");
		
		List<Map<String,String>> listMapOfCountry = new ArrayList<>();
		listMapOfCountry.add(mapOfCountry);
		listMapOfCountry.add(mapOfCountry1);
		listMapOfCountry.add(mapOfCountry2);
		listMapOfCountry.add(mapOfCountry3);
		listMapOfCountry.add(mapOfCountry4);
		
		for (Map<String, String> it : listMapOfCountry  ) {
			System.out.println(it);
			
		}
		
		
		
	}
}
