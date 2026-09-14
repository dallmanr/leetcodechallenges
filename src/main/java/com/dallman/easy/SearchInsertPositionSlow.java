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

This was my first attempt and it is slow! Ran in 2ms and beat just 0.85% of submissions

*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchInsertPositionSlow {

    static void main() {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5)); // Expected output == 2
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2)); // Expected output == 1
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7)); // Expected output == 4
    }

    static int searchInsert(int[] nums, int target) {

        List<Integer> numsList = new ArrayList<>();

        for (int i : nums) {
            numsList.add(i);
        }

        if (!numsList.contains(target)) {
            numsList.add(target);
            Collections.sort(numsList);
        }
        return numsList.indexOf(target);
    }
}
