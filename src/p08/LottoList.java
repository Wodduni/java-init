package p08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoList {
	public static void main(String[] args) {
		List<Integer> lottoIntegers = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			int rNum = random.nextInt(7)+1;
			if (lottoIntegers.indexOf(rNum) == -1) {
				lottoIntegers.add(rNum);
			}else {
				i--;
			}
		}
		for (int i = 0; i < lottoIntegers.size(); i++) {
			System.out.println(lottoIntegers.get(i));
		}
	}
}
