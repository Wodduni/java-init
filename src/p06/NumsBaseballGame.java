package p06;

import java.util.Random;
import java.util.Scanner;

public class NumsBaseballGame {
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int[] baseBallNums = new int[3];
		
		for (int i = 0; i < baseBallNums.length; i++) {
			int ranNum = random.nextInt(10);
			baseBallNums[i] = ranNum;
			for (int j = 0; j < i; j++) {
				if (baseBallNums[i] == baseBallNums[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < baseBallNums.length; i++) {
			System.out.println(i + "번째 숫자 : " + baseBallNums[i]);
		}
		
		boolean out = false;
		
		while (!out) {
			
			String yourNum = scanner.nextLine();
			String[] yourNums = yourNum.split(",");
			for (int i = 0; i < yourNums.length; i++) {
				System.out.print(yourNums[i]);
			}
			
			System.out.println();
			
			int s = 0;
			int b = 0;
			
			for (int i = 0; i < baseBallNums.length; i++) {
				for (int j = 0; j < yourNums.length; j++) {
					if (baseBallNums[i] == Integer.parseInt(yourNums[j])) {
						b++;
						if(i == j) {
							s++;
							b--;
						}
					}
				}
			}
			System.out.println(s + " Strike, " + b + " Ball");
			if (s == yourNums.length) {
				System.out.println("Correct!!");
				out = true;
				break;
			}
			
		}
		
		
	}
}
