package p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("age", 33);
		map.put("likenum", 7);
		map.put("rank", 11);
		System.out.println(map.get("age"));
		System.out.println(map.get("likenum"));
		System.out.println(map.get("rank"));
		
		Iterator<String> iterator =map.keySet().iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("Key : " + key + " , vlaue : " + map.get(key));
			
		}
	}
}

