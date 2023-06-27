package p02;

public class ArrayTest {
	public static void main(String[]args) {
		String[] strs;
		String[] str2 = new String[2];
		
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		
		str2[0] = "1";
		str2[1] = "2";
		
		String[] strNums = new String[10];
		
		for(int i=0; i<=9; i++) {
			
			strNums[i] = i+1+"";
			System.out.println(strNums[i]);
			
		}
		
		
		
	}
}
