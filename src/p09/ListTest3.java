package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import p02.forLoop;

public class ListTest3 {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		Random random = new Random();
		
		while(numList.size()<50) {
			int rNum = random.nextInt(100)+1;
			if ( rNum % 2 == 1 || rNum == 1 && numList.indexOf(rNum) == -1) {
					numList.add(rNum);
			}
		}
		
		for (int i = 0; i < numList.size(); i++) {
			System.out.print(numList.get(i)+ ", ");
		}
		
	}
}
