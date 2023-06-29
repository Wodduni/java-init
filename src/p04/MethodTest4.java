package p04;

import java.util.Random;

public class MethodTest4 {
	public static int[] getLotto(int lottoNum, int randomNum) {
		int[] lotto = new int [lottoNum];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = MethodTest2.getRandomNum(randomNum);
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		return lotto;
	}
	public static void printLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
	public static void main(String[] args) {
//		String[] str = new String[1];
//		String[] str2 = new String[1];
//		str = str2;
//		str[0] = "안녕";
//		System.out.println(str2[0]);
		
		int[] lotto = getLotto(6, 45);
		printLotto(lotto);
		

	}
}
