package com.dallman.other;

import java.util.Arrays;

public class BubbleSortExample {

    static void main() {
        int[] numbers = {
                17, 42, 3, 29, 0, 8, 35, 21, 49, 12,
                26, 6, 44, 19, 31, 2, 38, 15, 50, 10,
                24, 7, 46, 33, 1, 28, 40, 14, 36, 5,
                23, 47, 18, 9, 30, 4, 43, 25, 39, 11,
                48, 20, 34, 13, 45, 22, 32, 27, 41, 16,
                37
        };
        System.out.println(Arrays.toString(bubbleSort(numbers)));
    }

    static int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

}
