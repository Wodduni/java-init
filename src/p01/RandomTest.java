package p01;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();
//		int i = r.nextInt(10) + 1;
//		System.out.println(i);
		int i1 = r.nextInt(10) + 1;
		System.out.println(i1);
		int i2 = r.nextInt(10) + 1;
		System.out.println(i2);
		
		int[] lotto = new int[3];
//		lotto[0] = i;
		lotto[1] = i1;
		lotto[2] = i2;
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		
		for(int i=0;i<3;i++) {
			lotto[i] = r.nextInt(10)+1;
			System.out.println(lotto[i]);
		}
		
		
		
	}
}
