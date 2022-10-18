package com.wissen.LeetcodeProblems;

public class RotateArray {
	
	public void rotate(int[] nums, int k) {
        int lengthOfNums = nums.length;
        if(k > lengthOfNums)
        {
            k = k % lengthOfNums;
        }
        /*for(int steps = 0;steps < k; steps++)
        {
            int currentLastNumber = nums[lengthOfNums-1], index = 0;
            for(index=lengthOfNums-1;index>0;index--)
            {
                nums[index] = nums[index-1];
            }
            nums[index] = currentLastNumber;
        }*/
        reverse(nums,0,lengthOfNums-k-1);
        reverse(nums,lengthOfNums-k,lengthOfNums-1);
        reverse(nums,0,lengthOfNums-1);


    }

    public void reverse(int[] nums, int startIndex, int endIndex)
    {
        while(startIndex <= endIndex)
        {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

}
