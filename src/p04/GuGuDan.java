package p04;

import java.util.Scanner;

public class GuGuDan {
	public static void printGuGuDan(int num, int num2 ) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		printGuGuDan(num ,num2);
	}
}
