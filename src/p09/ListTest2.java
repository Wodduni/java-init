package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import p02.forLoop;

public class ListTest2 {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		Random random = new Random();
		while(numList.size()<20) {
			int rNum = random.nextInt(100)+1;
			if (numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}
		}
		for (int i = 0; i <numList.size(); i++) {
			System.out.print(numList.get(i)+", ");
		}
		System.out.println("");
		
		for (int i = 0; i < numList.size(); i++) {
			int cnt = 0;
			String searchString = numList.get(i)+"";
				for (int j = 0; j < searchString.length(); j++) {
					char charStr = searchString.charAt(j);
					if (charStr == '3' ||charStr == '6'||charStr == '9' ) {
						cnt ++;
					}
				}
			
			if (cnt == 2) {
				System.out.print("짝짝, ");
			}else if (cnt == 1) {
				System.out.print("짝, ");
			}
			else {
				System.out.print(numList.get(i)+", ");
			}
			
		}
		
		for (int i = 0; i < numList.size(); i++) {
			String numString = numList.get(i).toString();
			numString = numString.replace("3", "짝");
			numString = numString.replace("6", "짝");
			numString = numString.replace("9", "짝");
		}
		
		
		
		
	}
}
