package p05;

public class MinMax {
	public static void main(String[] args) {
		int nums[] = new int[] {10,25,-3,-4,-5};
		
		int max = nums[0];
		int min = nums[0];
		int maxIdx = 0;
		int minIdx = 0;
		
		for (int i = 1; i < nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
				maxIdx = i; 
			}
			if(min>nums[i]) {
				min = nums[i];
				minIdx = i;
			}
		}
		System.out.println("최대" + max + ",index : " + maxIdx);
		System.out.println("최소" + min + ",index : " + minIdx );
	}
}
