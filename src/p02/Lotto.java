package p02;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i <lotto.length; i++) {
			double db = Math.random();
			db *= 45;
			db += 1;
			int rNum = (int) db;
			lotto[i] = rNum;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("lotto["+i+"] =" + lotto[i]);
		}
	}
}
