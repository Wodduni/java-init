package p08;

import java.util.ArrayList;

public class ListTest2 {
	public static void main(String[] args) {
		float[] fls= new float[3];
		fls[0] = 1.1f;
		fls[1] = 22.1f;
		fls[2] = 0.1111f;
		
		char[] chars = new char[3];
		chars[0] = 'a';
		chars[1] = 'b';
		chars[2] = 'c';
		
		String[] strs = new String[3];
		strs[0] = "we";
		strs[1] = "Everybody";
		strs[2] = "Fighting!";
		
		ArrayList<Float> flsList = new ArrayList<Float>();
		for (int i = 0; i < fls.length; i++) {
			flsList.add(fls[i]);
		}
		
		ArrayList<Character> charList = new ArrayList<Character>();
		for (int i = 0; i < chars.length; i++) {
			charList.add(chars[i]);
		}
		
		ArrayList<String> strsList = new ArrayList<String>();
		for (int i = 0; i < strs.length; i++) {
			strsList.add(strs[i]);
		}
		
		for (int i = 0; i < flsList.size(); i++) {
			System.out.println(flsList.get(i));
		}
		
		for (int i = 0; i < strsList.size(); i++) {
			System.out.println(strsList.get(i));
			
		}
		for (int i = 0; i < charList.size(); i++) {
			System.out.println(charList.get(i));
		}
		
		
	}
}
