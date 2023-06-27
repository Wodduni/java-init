package p01;

import java.util.Scanner;

public class DataType2 {
	public static void main(String[] args) {
		String str = "1234";
		System.out.println(str.length());
		System.out.println(str.substring(1));
		System.out.println(str.substring(1,3));
		int idx = str.indexOf("3");
		System.out.println("3의 index : " + idx);
		idx = str.indexOf("5");
		System.out.println("5의 index : " + idx);
		
		Scanner scan = new Scanner(System.in);
		

		
	}
}
