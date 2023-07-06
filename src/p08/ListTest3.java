package p08;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		
		List<String> strList2 = new ArrayList<>();
		strList2.add("Hi");
		System.out.println(strList2.get(0));
		strList2.remove(0);
		System.out.println(strList2.get(0));
		//Collection FrameWork
		//List.Map.Set = Interface
		
	}
}
