package org.leetcode.arrays;

import java.util.Arrays;

public class FindMaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int longestSequence = 0;
        int left = 0;
        int right = 0;
        int numberOfZero = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                numberOfZero++;
            }
            //check the validity of interval
            while (numberOfZero == 2) {
                if (nums[left] == 0) {
                    numberOfZero--;
                }
                left++;
            }
            longestSequence = Math.max(longestSequence, right - left + 1);
            right++;
        }

        return longestSequence ;

    }
}
