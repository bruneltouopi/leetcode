package org.leetcode.arrays;

import org.leetcode.utils.Utils;

/**
 * @author bruno-fabrice touopi
 */
public class RemoveElement {
    public static void main(String[] args) {
            int[] nums = new int[]{0,1,2,2,3,0,4,2};
        System.out.printf("k=%d",removeElement(nums,2));
        Utils.printArrayInt(nums);
        int[] nums2 = new int[]{3,2,2,3};
        System.out.printf("k=%d",removeElement(nums2,3));
        Utils.printArrayInt(nums2);
    }

    public static int removeElement(int[] nums, int val) {
   /* int length = nums.length;
        int p=length-1;
        for (int i = 0; i <p ; i++) {
                if (nums[i] == val) {
                    while(nums[p]==val) {
                        nums[p] = 0;
                        p--;
                        length--;
                    }
                    length--;
                    nums[i] = nums[p];
                    nums[p] = 0;
                }

        }
        return length;*/
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;

    }
}
