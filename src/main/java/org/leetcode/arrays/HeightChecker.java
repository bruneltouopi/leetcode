package org.leetcode.arrays;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 1, 2, 3, 4};
        System.out.println(heightChecker(nums));
    }


    public static int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }

        }
        return count;
    }
}
