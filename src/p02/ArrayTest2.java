package p02;

import java.util.Iterator;

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] strs = new String[10];
		
		for (int i = 0; i < 10; i++) {
			strs[i] = (i+1)*2+"";
			System.out.println(strs[i]);	
		}
		
		
		
	}
}
