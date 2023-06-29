package p03;

public class ArrayTest {
	public static void main(String[] args) {
		int[] ages = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] tmp = ages;
		ages = new int[15];
		
		if(tmp.length <= ages.length) {
			for (int i = 0; i <tmp.length ; i++) {
			ages[i] = tmp[i];
			}
		}else if(tmp.length >= ages.length) {
			for (int i = 0; i <ages.length ; i++) {
				ages[i] = tmp[i];
				}
		}
		
		for (int i = 0; i < ages.length; i++) {
			System.out.println("ages["+i+"]:"+ages[i]);

		}
	}
}
