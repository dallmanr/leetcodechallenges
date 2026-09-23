package com.dallman.easy;

/*
* 268. Missing Number
* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
* Example 1:
* Input: nums = [3,0,1]
* Output: 2
* Explanation:
* n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
*
*
* Notes:
* Data is unsorted initially so comparing [i] to [i+1] won't work
* We create a new array, that contains all the values within the range we expect
* For example, nums [0,1] we create a new array of values [0,1,2]
* In our new array, we set the value of the new array to the same value of the existing nums array
* Where any value is missing in the range, it does not get set in our new array and remains at -1
* If we have a -1 within the array, then that value is missing in our range
*
 * */


import java.util.Arrays;

public class MissingNumber {
    static void main(String[] args) {
        // n = 3 so all numbers in the range [0,1,2,3] - Expected output == 2
        System.out.println(missingNumber(new int[]{3, 0, 1}));

        // n = 2 so we should have all numbers between 0 and 2 [0,1,2] - Expected output == 2
        System.out.println(missingNumber(new int[]{0, 1}));

        // n = 3 so all numbers in the range [0,1,2,3,4,5,6,7,8,9] - Expected output == 8
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    static int missingNumber(int[] nums) {
        // Get the range of numbers that should appear within our array, e.g. 2 = [0,1,2]
        int n = nums.length;
        // Create a new array, +1 greater than the size of nums
        // so that we can store every number within the range
        int[] v = new int[n+1];
        // Fill the new array with -1 values as our nums array has 0 as its lowest value
        Arrays.fill(v, -1);

        // We set the position of v at index nums[i] to nums[i]
        // This means where we have a value missing in the range, that value remains -1
        for(int i = 0; i < nums.length; i++) {
            v[nums[i]] = nums[i];
        }

        // After setting all present values in range, we check for any that remain as -1
        // If the value remains at -1, then it is missing from the range so return it
        for(int i = 0; i < v.length; i++) {
            if(v[i] == -1) return i;
        }
        return 0;
    }
}

