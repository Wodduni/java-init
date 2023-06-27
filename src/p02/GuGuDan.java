package p02;

import java.util.Scanner;

public class GuGuDan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1-9 숫자입력 : ");
		String numString = scanner.nextLine();
		System.out.println("입력한 숫자 : " + numString);
		 int nums = Integer.parseInt(numString);
		for(int i=1; i<10; i++) {
		 System.out.printf(numString+"*"+i+ "=" + "%d\n", nums*i);
		}
		
	}
}
