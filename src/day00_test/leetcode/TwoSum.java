package day00_test.leetcode;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
	
		int[] nums = {1,5,8,0,15,7};
		System.out.println(Arrays.toString(Solution(nums, 12)));
		
    }
	
	public static int[] Solution(int[] nums, int target) {
		int[] answer = new int [2];
		int x=0;
		int y=0;
		for(int i=0, lens= nums.length;i<lens-1 ;i++) {
			for(int j=1;j<lens;j++) {
				if(nums[i]+nums[j]==target) {
					x=i;
					y=j;
				}
			}
		}
		answer[0]=x;
		answer[1]=y;
		return answer;
	}
	

}
