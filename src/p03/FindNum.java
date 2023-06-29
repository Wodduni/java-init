package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean correct = false;
		Random random = new Random();
		int rNum = random.nextInt(10)+1;
		int i = 0 ;
		while(!correct) {
			System.out.println("1 - 10 enter the number  : ");
			int inputNum = Integer.parseInt(scanner.nextLine());
			i++;
			if(rNum == inputNum) {
				
				System.out.println(i+" " + "Yes!");
				correct = true;
			}else {
				
				System.out.println("No!");
			}
		}
	}
}
