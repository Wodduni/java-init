package p02;

import java.util.Scanner;

public class GuGuDan2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		String numString = scanner.nextLine();
		int num = Integer.parseInt(numString);
		for(int i=0; i<=10; i++) {
			System.out.println(i+"*"+num+"="+num*i);
		}
	}
}
