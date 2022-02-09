package org.leetcode.arrays;

/**
 * @author bruno-fabrice touopi
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        int j = nums.length;
        int i = 0;
        int temp = 0;

        while (i < j) {
            j--;
            if (nums[j] % 2 == 0) {
                while (nums[i] % 2 == 0 && i<j) {
                    i++;
                }
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;

            }
        }
        return nums;
    }

}
