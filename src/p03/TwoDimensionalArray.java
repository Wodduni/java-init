package p03;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] numsArray = new int [3][3];
		int count = 1;
		for (int i = 0; i < numsArray.length; i++) {
//			System.out.println(numsArray[i].length);
			for (int j = 0; j < numsArray[i].length; j++) {
				numsArray[i][j] = count++;
			}
		}
		for (int i = 0; i < numsArray.length; i++) {
			for (int j = 0; j < numsArray[i].length; j++) {
				System.out.print(numsArray[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
