package p01;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
	public static void main(String[]args) {
		Random r = new Random();
		int rNum = r.nextInt(10)+1;
		
		Scanner scan = new Scanner(System.in);
//		int num = scan.nextLine(); 
		int num = Integer.parseInt(scan.nextLine());
		if(rNum == num) {
			System.out.println("Yes");
		}else {
			System.out.print("No answer is : " + rNum);
		}
	}
}
