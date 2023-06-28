package p02;

import java.util.Iterator;
import java.util.Random;

public class lotto2 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random rNum = new Random(0);
		for (int i = 0; i < lotto.length; i++) {
			
			lotto[i] = rNum.nextInt(45)+1;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("lotto["+i+"]"+lotto[i]);
		}
	}
}
