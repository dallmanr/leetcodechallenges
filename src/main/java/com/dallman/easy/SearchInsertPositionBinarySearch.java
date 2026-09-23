package com.dallman.easy;

/*
35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

Notes to self:
* We can use binary search because the data is already sorted!
* Binary search == divide and conquer approach
* We split the dataset in half and check either side for the given value to determine where it belongs

*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchInsertPositionBinarySearch {

    static void main() {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5)); // Expected output == 2
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2)); // Expected output == 1
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7)); // Expected output == 4
    }

    static int searchInsert(int[] nums, int target) {
        // Less than target
        int left = 0;
        // Greater than target
        int right = nums.length - 1;

        while (left <= right) {
            //Find the middle value of the array
            int mid = left + (right - left) / 2;

            //Is the middle value equal to our target value?
            if (nums[mid] == target) {
                return mid;
            }

            // If our target value is greater, we can ignore anything less than/left bucket
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        return left;
    }
}
