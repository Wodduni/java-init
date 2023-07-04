package p06;

import java.util.SortedSet;

import p03.Sort;

public class SortTest {
	public static void main(String[] args) {
		
		int[] nums = new int[] {10,7,15,1,4};
		
		for (int i = 0; i < nums.length; i++) {
			int min = nums[i];
			int idx = i;
			for (int j = i+1; j < nums.length; j++) {
				if (min > nums[j]) {
					min = nums[j];
					idx = j;
					int swapNums = nums[i];
					nums[i] = nums[idx];
					nums[idx] = swapNums;
				}
				
			}
		}
		for (int j = 0; j < nums.length; j++) {
			System.out.println(nums[j]);
		}
		
	}
}
