package p01;

import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class FindNum {
	public static void main(String[]args) {
		Random r = new Random();
		int rNum = r.nextInt(3) +1;
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.println("Enter your Number");
			String str = scan.nextLine();
			int num = Integer.parseInt(str);
			if(rNum==num) {
				System.out.println("Nice");
			}else {
				System.out.println("Bad");
			}
		}
	
	}
}
