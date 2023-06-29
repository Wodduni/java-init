package p04;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static String getRock() {
		Random random = new Random();
		int rNum = random.nextInt(3);
		if (rNum == 0) {
			return "가위";
					}
		if (rNum == 1) {
			return "바위";
		}
		if(rNum == 2){
			return "보";
		}
		return "";
	}
	
	public static void main(String[] args) {
		String rockString = getRock();
		Scanner scanner = new Scanner(System.in);
		System.out.println("R S P : ");
		String urRock = scanner.nextLine();
		String computerRock = getRock();
		 System.out.println(computerRock);
		
		if (urRock.equals(computerRock)) {
			System.out.println("Draw");
		}else if (urRock.equals("가위")) {
			if (computerRock.equals("바위")) {
				System.out.println("loose");
			}else if (computerRock.equals("보")) {
				System.out.println("Win");
			}
		}else if (urRock.equals("바위")) {
			if (computerRock.equals("보")) {
				System.out.println("loose");
			}else if (computerRock.equals("가위")) {
				System.out.println("Win");
			}
		}else if (urRock.equals("보")) {
			if (computerRock.equals("가위")) {
				System.out.println("loose");
			}else if (computerRock.equals("바위")) {
				System.out.println("Win");
			}
		}
		
		
	}
}
