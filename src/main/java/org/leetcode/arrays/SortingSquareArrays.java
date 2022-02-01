package org.leetcode.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingSquareArrays {

    public static void main(String[] args) {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] nums2 = new int[]{-7, -3, 2, 3, 11};

        printArrayValues(sortedSquares(nums));
        System.out.println("table2");
        printArrayValues(sortedSquares(nums2));
    }

    public static int[] sortedSquares(int[] nums) {
        int bigger = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[i] = nums[i] * nums[i];
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (i == 0) {
                    nums[j] = nums[j] * nums[j];
                }
                if (nums[i] > nums[j]) {
                    bigger = nums[i];
                    nums[i] = nums[j];
                    nums[j] = bigger;
                }
            }
        }
        return nums;
    }

    public static void printArrayValues(int[] nums) {
        IntStream.of(nums).forEach(e -> System.out.printf("%d,", e));
    }
}
