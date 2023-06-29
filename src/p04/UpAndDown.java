package p04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	public static int getRanNum() {
		Random r = new Random();
		return r.nextInt(50) + 1;
	}

	public static boolean match(int num1, int num2) {
		if (num1 == num2) {
			return true;
		}
		if (num1 > num2) {
			System.out.println("UP");
		} else if (num1 < num2) {
			System.out.println("DOWN");
		}
		return false;
	}

	public static void main(String[] args) {
		int rNum = getRanNum();

		Scanner scan = new Scanner(System.in);
		int num = 0;
		while (!match(rNum, num)) {
			System.out.println("1-50 : ");
			String numStr = scan.nextLine();
			num = Integer.parseInt(numStr);
			
		}
		System.out.println("맞췄다.");
	}
}