package com.dallman.easy;

import java.util.Arrays;
public class RemoveElement {
/*
    27. Remove Element
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    Return k.

    https://leetcode.com/problems/remove-element/submissions/2139457913/
    https://leetcode.com/problems/remove-element/solutions/8515677/beginner-friendly-step-by-step-visualiza-7y6i/
 */


    static void main() {
//        removeElement(new int[]{3,2,2,3}, 3);
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    static int removeElement(int[] nums, int val) {
        // Index == the write slot, where the next kept value goes
        int index = 0;
        // i == read pointer, we check every element
        for (int i = 0; i < nums.length; i++) {
            // If the value as position nums[i] != val, we can keep it, otherwise, move on
            if (nums[i] != val) {
                // Copy the value at nums[i] to the position of nums[index] which starts at 0 as well
                // Index only increments if the nums[i] != val
                nums[index] = nums[i];
                // Every time index is incremented, we know we have a non val value in the array
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }

}
