package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
	public static void main(String[] args) {
		System.out.println("1-45 enter the number");
		Scanner scanner = new Scanner(System.in);
		String lottoStr = scanner.nextLine();
		String[] strs = lottoStr.split(",");
		
		Random random = new Random();
		
		int[] lotto = new int[6];
		int k = 0;
		
		for (int i = 0; i < 6; i++) {
			int lottoNum = random.nextInt(7)+1;
			lotto[i] = lottoNum;
			System.out.print(lotto[i]);
		}
		System.out.println("");
		for(int i=0; i < strs.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				if(strs[i].equals(lotto[j]+"")) {
					k++;
				
				}
			}
		}
		
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]);
		}
		System.out.println("");
		System.out.println(k+"개 맞음");
		
		
		
	}
}
