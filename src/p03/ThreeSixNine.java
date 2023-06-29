package p03;

import java.util.Iterator;

public class ThreeSixNine {
	public static void main(String[] args) {
		for(int i=0; i<=100; i++) {
			String nums = i+"";
			if(nums.contains("3")||nums.contains("6")||nums.contains("9"))  {
				System.out.println("짝");
			}else {
				System.out.println(i);
				
			}
			
		}
	}
}
