package org.leetcode.arrays;

import java.util.Arrays;

/**
 * @author bruno-fabrice touopi
 */
public class MaxConsecutive {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, 1, 0, 1, 1, 1, 1, 9, 1, 1, 1};
//        System.out.println(findMaxConsecutiveOnes(nums));
        int[] nums1 = new int[]{555,901,482,1771,1241};
        System.out.println(findNumbers(nums1));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxValue = 0;
        int currentCount = 0;
        for (int array : nums) {
            if (array == 1) {
                currentCount++;

            } else {
                currentCount = 0;
            }
            maxValue = Math.max(currentCount, maxValue);
        }
        return maxValue;
    }

    public static int findNumbers(int[] nums) {

        int numberOfEven = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = 1;
            int numberDigit = 0;
            do {
                numberDigit++;
                digit *= 10;
            } while (nums[i] / digit > 0);
            if (numberDigit % 2 == 0) {
                numberOfEven++;
            }

        }

        return numberOfEven;
    }
}
