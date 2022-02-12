package org.leetcode.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ThirdMax {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2,3};
        System.out.println(thirdMaxVersion2(nums));
    }

    public static int thirdMax(int[] nums) {
        int length = nums.length;
        int right = nums.length - 1;
        int indexMax = 1;
        int thirdMax = 0;
        Arrays.sort(nums);
        while (right > 0) {
            if (nums[right] > nums[right - 1]) {
                indexMax++;
            }
            if (indexMax == 3) {
                thirdMax = nums[right - 1];
            }
            right--;
        }
        if (indexMax < 3) {
            thirdMax = nums[length - 1];
        }
        return thirdMax;
    }
    public static int thirdMaxVersion2(int[] nums) {
        Set<Integer> max=new HashSet<>();
        for (int num : nums) {
            max.add(num);
            if (max.size() > 3) {
                max.remove(max.stream().min(Integer::compareTo));
            }
        }
        if (max.size()==3){
            return max.stream().min(Integer::compareTo).get();
        }
         return max.stream().max(Integer::compareTo).get();
    }
}
